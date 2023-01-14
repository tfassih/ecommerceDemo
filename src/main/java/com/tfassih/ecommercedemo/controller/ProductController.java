package com.tfassih.ecommercedemo.controller;

import com.tfassih.ecommercedemo.dao.ProductDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductDao product;

    public ProductController(ProductDao product){
        this.product = product;
    }
}
