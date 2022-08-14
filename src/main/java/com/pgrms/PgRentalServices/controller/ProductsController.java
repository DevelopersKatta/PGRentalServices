package com.pgrms.PgRentalServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pgrms.PgRentalServices.services.ProductsServices;

@RestController
public class ProductsController {

	@Autowired
	private ProductsServices productServces;

	@GetMapping("/products")
	public String saveProduct(@RequestParam("image") MultipartFile file, 
			@RequestParam("pname") String name) { 
		productServces.saveProducts(file, name);
		return "Done...";

	}

}
