package com.pgrms.PgRentalServices.services;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.pgrms.PgRentalServices.Entities.Users;
import com.pgrms.PgRentalServices.repositories.UsersRepository;

@Service
@Transactional
public class UsersService {

	@Autowired
	private UsersRepository usersRepo;

//	gget all users
	public List<Users> listAll() {
		return usersRepo.findAll();
	}

//	get user by id 
	public Users getUserById(int id) {
		return usersRepo.findAll().stream().filter(s -> s.getUserId() == id).findFirst().get();
	}

//	public void saveUserIntoDb(Users users, MultipartFile file) {
//		String filename = StringUtils.cleanPath(file.getOriginalFilename());
//		if(filename.contains("..")) {
//			System.out.println("Not a valid file");
//		}
//		try {
//			users.setUserPhoto(Base64.getEncoder().encodeToString(file.getBytes()));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		usersRepo.save(users);
//	}

	public void saveUserIntoDb(String userName, long userMobile, String userEmail, String usersAddress,
			String userCity, String userRole, String userPassword, MultipartFile file) {
		// TODO Auto-generated method stub
		Users users = new Users();
		String filename = StringUtils.cleanPath(file.getOriginalFilename());
		if (filename.contains("..")) {
			System.out.println("Not a valid file");
		}
		try {
			users.setUserPhoto(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		users.setUserName(userName);
		users.setUserMobile(userMobile);
		users.setUserEmail(userEmail);
		users.setUsersAddress(usersAddress);
		users.setUserCity(userCity);
		users.setUserRole(userRole);
		users.setUserPassword(userPassword);
		usersRepo.save(users);
	}

//	saving a specific record by using the method save() of CrudRepository
//	public void saveOrUpdate(Users users) {
//		userRepo.save(users);
//	}
//	
////	geting a specific record by using the method findById() of CrudRepository
//	public Users getUsersById(long id) {
//		return userRepo.findById(id).get();
//	}
//	
////	updating records
//	public void update(Users users) {
//		userRepo.save(users);
//	}

}
