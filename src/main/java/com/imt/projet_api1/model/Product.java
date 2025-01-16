package com.imt.projet_api1.model;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produits")
@NoArgsConstructor
@Data
public class Product {

    @Id
    private int reference;

    @Size(max=25)
    private String name;

    @Size(max = 25)
    private String description;

    @Positive
    private double price;

    public Product(int reference, String name, String description, double price) {
        this.reference = reference;
        this.name = name;
        this.description = description;
        this.price = price;
    }


}
