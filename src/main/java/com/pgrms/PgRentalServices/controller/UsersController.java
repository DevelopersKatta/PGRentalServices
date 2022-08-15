package com.pgrms.PgRentalServices.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pgrms.PgRentalServices.Entities.Users;
import com.pgrms.PgRentalServices.services.UsersService;


@RestController
public class UsersController {
	@Autowired
	private UsersService userService;
	
	@GetMapping("/users")
	public List<Users> list(){
		return userService.listAll();
	}
	
	@GetMapping("/users/{id}")
	public Users getSingleUserById(@PathVariable("id")int id) {
		return userService.getUserById(id);
	}
	
//	@PostMapping("/users")
//	public String saveData(@RequestBody Users users, MultipartFile file) {
//		userService.saveUserIntoDb(users, file);
//		return "done...";
//	}
//	
	
	@PostMapping("/users")
	public String saveData(
			@RequestParam("userName") String userName,
			@RequestParam("userMobile") long userMobile,
			@RequestParam("userEmail") String userEmail,
			@RequestParam("usersAddress") String usersAddress,
			@RequestParam("userCity") String userCity,
			@RequestParam("userRole") String userRole,
			@RequestParam("userPassword") String userPassword,
			@RequestParam("userPhoto") MultipartFile file
			) {
		userService.saveUserIntoDb(userName, userMobile, userEmail, usersAddress 
				,userCity ,userRole ,userPassword ,file);
		return "1 entry successfully";	}
	
	
	
}
