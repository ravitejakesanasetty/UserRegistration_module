package com.sp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.entity.User;
import com.sp.exception.UserNotFound;
import com.sp.response.Response;
import com.sp.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	
	@PostMapping("/registration")
	private Response<User> createUser(@RequestBody User user)
	{
		return service.create(user);
	}
	
	@GetMapping("/findUserById/{id}")
	private Response<User> findUserById(@PathVariable("id") Integer id) throws UserNotFound
	{
		return service.getUserById(id);
	}
	
	@GetMapping("/users")
	private Response<List<User>> getUsers(){
		return service.getUsers();
	}
	
	@PutMapping("/updateUserById/{id}")
	private Response<User> updateUser(@PathVariable("id") Integer id,@RequestBody User user) {
		return service.updateUserById(id,user);
	}
	
	@DeleteMapping("/delete/{id}")
	private Response deleteById(@PathVariable("id") Integer id) {
		return service.deleteUser(id);
		
	}
}
