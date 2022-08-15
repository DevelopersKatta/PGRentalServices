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

import com.pgrms.PgRentalServices.Entities.Reviews;
import com.pgrms.PgRentalServices.services.ReviewsService;

@RestController
public class ReviewsController {

	@Autowired
	private ReviewsService service;

	// RESTful API methods for Retrieval operations
	@GetMapping("/reviews")
	public List<Reviews> list() {
		return service.listAll();
	}

	// RESTful API method for Create operation
	@PostMapping("reviews")
	public String saveReviews(@RequestBody Reviews rq) {
		service.saveReviews(rq);
		return "1 entry successfully";
	}

	// RESTful API method for find operation
	@GetMapping("/reviews/{id}")
	public Reviews getPgById(@PathVariable("id") int id) {
		return service.getReviewsById(id);
	}

	// RESTful API method for Update operation
	@PutMapping("/reviews/{id}")
	public String updateHouseById(@PathVariable("id") int id, @RequestBody Reviews rq) {
		service.updateReviewsById(id, rq);
		return "1 Entry Updated Successfully!";
	}

	// RESTful API method for Delete operation
	@DeleteMapping("reviews/{id}")
	public String deleteById(@PathVariable("id") int id) {
		service.deleteReviewsById(id);
		return "1 Entry deleted Successfully";
	}
}
