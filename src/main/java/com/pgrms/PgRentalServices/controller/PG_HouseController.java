package com.pgrms.PgRentalServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pgrms.PgRentalServices.Entities.PG_Houses;
import com.pgrms.PgRentalServices.services.PG_HousesService;

@RestController
public class PG_HouseController {

	@Autowired
	private PG_HousesService service;

	// RESTful API methods for Retrieval operations
	@GetMapping("/pghouses")
	public List<PG_Houses> list() {
		return service.listAll();
	}

	// RESTful API method for Create operation
	@PostMapping("pghouses")
	public String savePGHouses(@RequestBody PG_Houses pg) {
		service.savePGHouse(pg);
		return "1 entry successfully";
	}

	// RESTful API method for find operation
	@GetMapping("/pghouses/{id}")
	public PG_Houses getPgById(@PathVariable("id") int id) {
		return service.getPGHousesById(id);
	}

	// RESTful API method for Update operation
	@PutMapping("/pghouses/{id}")
	public String updateHouseById(@PathVariable("id") int id, @RequestBody PG_Houses pg) {
		service.updateHouseById(id, pg);
		return "1 Entry Updated Successfully!";
	}

	// RESTful API method for Delete operation
	@DeleteMapping("pghouses/{id}")
	public String deleteById(@PathVariable("id") int id) {
		service.deletePGHouseById(id);
		return "1 Entry deleted Successfully";
	}
}
