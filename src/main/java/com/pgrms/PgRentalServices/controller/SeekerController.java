package com.pgrms.PgRentalServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pgrms.PgRentalServices.Entities.Seeker;
import com.pgrms.PgRentalServices.services.SeekerService;

@RestController
public class SeekerController {
	
	@Autowired
	private SeekerService seekerService;

	@GetMapping("/seekers")
	public List<Seeker> list() {
		return seekerService.listAll();
	}

	@GetMapping("/seekers/{id}")
	public Seeker getSingleSeekerById(@PathVariable("id") int id) {
		return seekerService.getSeekerById(id);
	}

	@PostMapping("/seekers")
	public String saveData(@RequestBody Seeker seeker) {
		seekerService.saveSeekerIntoDb(seeker);
		return "1 entry successfully";
	}


	@DeleteMapping("/seekers")
	public String deleteSingleData(@PathVariable("id") int id) {
		seekerService.deleteSeekerById(id);
		return "1 entry successfully";
	}
}
