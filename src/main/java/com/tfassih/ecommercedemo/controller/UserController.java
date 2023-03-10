package com.tfassih.ecommercedemo.controller;

import com.tfassih.ecommercedemo.model.UserModel;
import com.tfassih.ecommercedemo.dao.UserDao;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {
    private final UserDao user;

    public UserController(UserDao user){
        this.user = user;
    }

    @GetMapping
    @ResponseBody
    public List<UserModel> getAllUsers(){
        return user.getAllUsers();
    }
    @GetMapping("/{name}")
    @ResponseBody
    public UserModel getUserByName(@PathVariable String name){
        return user.findByName(name);
    }
    @GetMapping("/{email}")
    @ResponseBody
    public UserModel getUserByEmail(@PathVariable String email){
        return user.findByEmail(email);
    }

    @PostMapping("/{email}/{name}")
    @ResponseBody
    public void createUser(@PathVariable String name,
                           @PathVariable String email){
        user.createUser(name, email);
    }

    @DeleteMapping("/{email}")
    @ResponseBody
    public void removeUser(@PathVariable String email){
        user.deleteUser(email);
    }
}
