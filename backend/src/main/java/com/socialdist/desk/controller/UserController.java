package com.socialdist.desk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialdist.desk.model.UserModel;
import com.socialdist.desk.respository.UserRepository;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/create")
	public void createUser(@RequestBody UserModel user) {
		userRepository.insert(user);
	}
	
	@PostMapping("/delete/{id}")
	public void deleteUser(@PathVariable String id) {
		userRepository.deleteById(id);
	}
		
	@GetMapping("/list")
	public List<UserModel> listUsers() {
		return userRepository.findAll();
	}
}
