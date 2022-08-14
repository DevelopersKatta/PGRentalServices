package com.pgrms.PgRentalServices.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgrms.PgRentalServices.Entities.Users;
import com.pgrms.PgRentalServices.repositories.UsersRepository;



@Service
@Transactional
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepo;
	
//	gget all users
	public List<Users> listAll(){
		return usersRepo.findAll();
	}
	
//	get user by id 
	public Users getUserById(int id) {
		return usersRepo.findAll().stream().filter(s->s.getUserId()==id).findFirst().get();
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
