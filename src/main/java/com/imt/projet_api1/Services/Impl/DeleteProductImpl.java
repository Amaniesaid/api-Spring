package com.imt.projet_api1.Services.Impl;

import com.imt.projet_api1.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imt.projet_api1.Services.DeleteProductService;

@Service(value = "Delete product impl")
public class DeleteProductImpl implements DeleteProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void deleteProductById(int id){
        productRepository.deleteById(id);
    }

}
