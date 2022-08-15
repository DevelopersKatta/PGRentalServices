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

import com.pgrms.PgRentalServices.Entities.Requests;
import com.pgrms.PgRentalServices.services.RequestsService;

@RestController
public class RequestsController {

	@Autowired
	private RequestsService service;

	// RESTful API methods for Retrieval operations
	@CrossOrigin
	@GetMapping("/requests")
	public List<Requests> list() {
		return service.listAll();
	}

	// RESTful API method for Create operation
	@CrossOrigin
	@PostMapping("requests")
	public String saverequests(@RequestBody Requests rq) {
		service.saveRequest(rq);
		return "1 entry successfully";
	}

	// RESTful API method for find operation
	@CrossOrigin
	@GetMapping("/requests/{id}")
	public Requests getPgById(@PathVariable("id") int id) {
		return service.getRequestById(id);
	}

	// RESTful API method for Update operation
	@CrossOrigin
	@PutMapping("/requests/{id}")
	public String updateHouseById(@PathVariable("id") int id, @RequestBody Requests rq) {
		service.updateRequestById(id, rq);
		return "1 Entry Updated Successfully!";
	}

	// RESTful API method for Delete operation
	@CrossOrigin
	@DeleteMapping("requests/{id}")
	public String deleteById(@PathVariable("id") int id) {
		service.deleteRequestById(id);
		return "1 Entry deleted Successfully";
	}
}
