package com.pgrms.PgRentalServices.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pgrms.PgRentalServices.Entities.Users;
import com.pgrms.PgRentalServices.repositories.UsersRepository;
import com.pgrms.PgRentalServices.services.UsersService;


@RestController
public class UsersController {
	@Autowired
	private UsersService userService;
	@Autowired
	private UsersRepository userRepository;
	
	@GetMapping("/users")
	public List<Users> list(){
		return userService.listAll();
	}
	
	@GetMapping("/users/{id}")
	public Users getSingleUserById(@PathVariable("id")int id) {
		return userService.getUserById(id);
	}
	
	@PostMapping("/users")
	public String saveData(@RequestBody Users users) {
		userRepository.save(users);
		return "done...";
	}
	
}
