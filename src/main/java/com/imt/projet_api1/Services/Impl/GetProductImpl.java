package com.imt.projet_api1.Services.Impl;

import com.imt.projet_api1.Repository.ProductRepository;
import com.imt.projet_api1.Services.GetProductService;
import com.imt.projet_api1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service(value = "Get product impl")
public class GetProductImpl implements GetProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Optional <Product> getProduitById(int id){
        return productRepository.findById(id);
    }

    @Override
    public Product findProductByPriceLessThan(int price) {
        return productRepository.findProductByPriceLessThan(price);
    }


}
