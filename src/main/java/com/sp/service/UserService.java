package com.sp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sp.entity.User;
import com.sp.exception.UserNotFound;
import com.sp.repository.UserRepository;
import com.sp.response.Response;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public Response<User> create(User user) {
		Response<User> response=new Response<>();
		response.setPayLoad(repo.save(user));
		response.setStatus(HttpStatus.OK);
				return response;
	}

	public Response<User> getUserById(Integer id) throws UserNotFound {
		Response<User> response=new Response<>();
		Optional<User> user=repo.findById(id);
		if(!user.isPresent()) {
			throw new UserNotFound("User not found with this Id");
		}
		else {
			
			response.setPayLoad1(user);
			response.setStatus(HttpStatus.OK);
			
		}
		return response;
	}

	public Response<List<User>> getUsers() {
		Response<List<User>> response=new Response<>();
		response.setPayLoad(repo.findAll());
		response.setStatus(HttpStatus.OK);
		
		return response;
	}

	public Response<User> updateUserById(Integer id, User user) {
		user.setUserId(id);
		Response<User> response=new Response<>();
		response.setPayLoad(repo.save(user));
		response.setStatus(HttpStatus.OK);
				return response;

	}

	public Response deleteUser(Integer id) {
		Response response=new Response<>();
    if(repo.findById(id).isPresent())
    {
    	repo.deleteById(id);
    	
		response.setStatus(HttpStatus.OK);
	     response.setPayLoad("User Data Deleted successfully");
    }
	return response;
	}
	
}
