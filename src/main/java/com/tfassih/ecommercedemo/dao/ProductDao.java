package com.tfassih.ecommercedemo.dao;

import com.tfassih.ecommercedemo.model.ProductModel;
import com.tfassih.ecommercedemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EnableMongoRepositories
public class ProductDao {
    @Autowired
    ProductRepository productRepo;

    public List<ProductModel> getAllProducts(){
        return productRepo.findAll();
    }

    public ProductModel getProductByUPC(String upc){
        return productRepo.getProductByUPC(upc);
    }
}
