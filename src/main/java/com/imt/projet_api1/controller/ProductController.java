package com.imt.projet_api1.controller;

import com.imt.projet_api1.Services.AddProductService;
import com.imt.projet_api1.Services.DeleteProductService;
import com.imt.projet_api1.Services.GetProductService;
import com.imt.projet_api1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    private GetProductService getProductService;

    @Autowired
    private AddProductService addProductService;

    @Autowired
    private DeleteProductService deleteProductService;

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product){
        addProductService.execute(product);
    }

    @GetMapping ("/getByRef")
    public Optional<Product> getProduct(@RequestParam int ref){
        return getProductService.getProduitById(ref);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable int id) {
        deleteProductService.deleteProductById(id);
    }


}
