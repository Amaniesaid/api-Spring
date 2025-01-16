package com.imt.projet_api1.Repository;

import com.imt.projet_api1.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Integer> {
    Product findProductByPriceLessThan(int price);
}
