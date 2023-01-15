package com.tfassih.ecommercedemo.dao;


import com.tfassih.ecommercedemo.model.UserModel;
import com.tfassih.ecommercedemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@EnableMongoRepositories
public class UserDao {
    @Autowired
    UserRepository userRepo;
    public List<UserModel> getAllUsers() {
        return userRepo.findAll();
    }
    public UserModel findByEmail(String email) {
        return userRepo.findByEmail(email);
    }
    public UserModel findByName(String name){
        return userRepo.findByName(name);
    }
    public void createUser(String name, String email){
        userRepo.save(new UserModel(name, email));
    }
    public void updateUser(String oldEmail, String email){
        UserModel user = userRepo.findByEmail(oldEmail);
        user.setEmail(email);
        userRepo.save(user);
    }
    public void deleteUser(String email){
        userRepo.delete(findByEmail(email));
    }
}
