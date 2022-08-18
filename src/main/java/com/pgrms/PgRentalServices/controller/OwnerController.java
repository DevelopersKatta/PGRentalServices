package com.pgrms.PgRentalServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pgrms.PgRentalServices.Entities.LoginDetails;
import com.pgrms.PgRentalServices.Entities.Owner;
import com.pgrms.PgRentalServices.services.OwnerService;

@RestController
public class OwnerController {
	
	@Autowired
	private OwnerService ownerService;

	@GetMapping("/owners")
	public List<Owner> list() {
		return ownerService.listAll();
	}

	@GetMapping("/owners/{id}")
	public Owner getSingleOwnerById(@PathVariable("id") int id) {
		return ownerService.getOwnerById(id);
	}
	

	@PostMapping("/owners/login")
	public Owner loginUser(@RequestBody LoginDetails loginDetails) throws Exception {
		return ownerService.getOwnerByCredential(loginDetails);
	}

	@PostMapping("/owners")
	public String saveData(@RequestBody Owner owner) throws Exception {
		ownerService.saveOwnerIntoDb(owner);
		return "1 entry successfully";
	}

	@DeleteMapping("/owners")
	public String deleteSingleData(@PathVariable("id") int id) {
		ownerService.deleteOwnerById(id);
		return "1 entry successfully";
	}
}
