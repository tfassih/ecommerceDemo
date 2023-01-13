package com.tfassih.ecommercedemo.repository;

import com.tfassih.ecommercedemo.model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends MongoRepository<ProductModel, String> {

}
