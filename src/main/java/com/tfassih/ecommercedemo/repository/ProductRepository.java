package com.tfassih.ecommercedemo.repository;

import com.tfassih.ecommercedemo.model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends MongoRepository<ProductModel, String> {
    @Query("{upc: '?0'}")
    public ProductModel getProductByUPC(String upc);

    public List<ProductModel> getAllProducts();
}
