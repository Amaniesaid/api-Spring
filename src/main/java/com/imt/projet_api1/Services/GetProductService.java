package com.imt.projet_api1.Services;

import com.imt.projet_api1.model.Product;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface GetProductService {

    Optional<Product> getProduitById(int id);

    Product findProductByPriceLessThan(int price);
}
