package com.tfassih.ecommercedemo;

import com.tfassih.ecommercedemo.dao.UserDao;
import com.tfassih.ecommercedemo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class EcommerceDemoApplication {
	@Autowired
	UserDao user;
	public static void main(String[] args) {
		SpringApplication.run(EcommerceDemoApplication.class, args);
	}
	public void getAllUsers(){
		user.getAllUsers().forEach((person -> System.out.println(getUserDetails(person))));
	}
	public void getUserByName(String name){
		System.out.println(getUserDetails(user.findByName(name)));
	}
	public void getUserByEmail(String email){
		System.out.println(getUserDetails(user.findByEmail(email)));
	}
	public String getUserDetails(UserModel person){
		System.out.println("ID: " + person.getId() +
							"/ Name: " + person.getName() +
							"/ Email: " + person.getEmail());
		return "";
	}

}
