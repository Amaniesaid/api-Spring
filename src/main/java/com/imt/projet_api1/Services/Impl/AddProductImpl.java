package com.imt.projet_api1.Services.Impl;

import com.imt.projet_api1.Repository.ProductRepository;
import com.imt.projet_api1.Services.AddProductService;
import com.imt.projet_api1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "Add product impl")
public class AddProductImpl implements AddProductService {

    @Autowired //C'est un beans gérer par spring(objet) il me permettra de persister
    private ProductRepository productRepository;

    @Override
    public void execute(Product produit){
        productRepository.save(produit);
    }
}
