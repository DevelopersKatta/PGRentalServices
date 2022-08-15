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

import com.pgrms.PgRentalServices.Entities.Wishlist;
import com.pgrms.PgRentalServices.services.WishlistService;

@RestController
public class WishlistController {

	@Autowired
	private WishlistService service;

	// RESTful API methods for Retrieval operations
	@CrossOrigin
	@GetMapping("/wishlist")
	public List<Wishlist> list() {
		return service.listAll();
	}

	// RESTful API method for Create operation
	@CrossOrigin
	@PostMapping("wishlist")
	public String saveWishlist(@RequestBody Wishlist rq) {
		service.saveWishlist(rq);
		return "1 entry successfully";
	}

	// RESTful API method for find operation
	@CrossOrigin
	@GetMapping("/wishlist/{id}")
	public Wishlist getPgById(@PathVariable("id") int id) {
		return service.getWishlistById(id);
	}

	// RESTful API method for Update operation
	@CrossOrigin
	@PutMapping("/wishlist/{id}")
	public String updateHouseById(@PathVariable("id") int id, @RequestBody Wishlist rq) {
		service.updateWishlistById(id, rq);
		return "1 Entry Updated Successfully!";
	}

	// RESTful API method for Delete operation
	@CrossOrigin
	@DeleteMapping("wishlist/{id}")
	public String deleteById(@PathVariable("id") int id) {
		service.deleteWishlistById(id);
		return "1 Entry deleted Successfully";
	}
}
