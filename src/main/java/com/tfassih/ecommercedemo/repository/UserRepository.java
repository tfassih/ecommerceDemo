package com.tfassih.ecommercedemo.repository;

import com.tfassih.ecommercedemo.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends MongoRepository<UserModel, String> {
    @Query("{email: '?0'}")
    UserModel findByEmail(String email);

    @Query(value="{name: '?0'}")
    UserModel findByName(String name);
}
