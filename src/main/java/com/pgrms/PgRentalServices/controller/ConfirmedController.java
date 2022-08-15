package com.pgrms.PgRentalServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pgrms.PgRentalServices.Entities.Confirmed;
import com.pgrms.PgRentalServices.services.ConfirmedService;

@RestController
public class ConfirmedController {


	@Autowired
	private ConfirmedService service;

	// RESTful API methods for Retrieval operations
	@CrossOrigin
	@GetMapping("/confirmed")
	public List<Confirmed> list() {
		return service.listAll();
	}

	// RESTful API method for Create operation
	@CrossOrigin
	@PostMapping("confirmed")
	public String saveConfirmed(@RequestBody Confirmed cfm) {
		service.saveConfirmed(cfm);
		return "1 entry successfully";
	}

	// RESTful API method for find operation
	@CrossOrigin
	@GetMapping("/confirmed/{id}")
	public Confirmed getPgById(@PathVariable("id") int id) {
		return service.getConfirmedById(id);
	}

	// RESTful API method for Update operation
	@CrossOrigin
	@PutMapping("/confirmed/{id}")
	public String updateHouseById(@PathVariable("id") int id, @RequestBody Confirmed cfm) {
		service.updateConfirmedById(id, cfm);
		return "1 Entry Updated Successfully!";
	}

	// RESTful API method for Delete operation
	@DeleteMapping("confirmed/{id}")
	@CrossOrigin
	public String deleteById(@PathVariable("id") int id) {
		service.deleteConfirmedById(id);
		return "1 Entry deleted Successfully";
	}
}
