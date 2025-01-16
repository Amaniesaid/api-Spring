package com.imt.projet_api1.Services;


import com.imt.projet_api1.model.Product;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface DeleteProductService {
    void deleteProductById(int id);
}

