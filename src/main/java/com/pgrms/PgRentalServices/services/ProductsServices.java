package com.pgrms.PgRentalServices.services;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.pgrms.PgRentalServices.Entities.Products;
import com.pgrms.PgRentalServices.repositories.ProductsRepositories;


@Service
public class ProductsServices {

	@Autowired
	private ProductsRepositories productsRepo;
	
	public void saveProducts(MultipartFile file, String name) {
		Products p = new Products();
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains("..")) {
			System.out.println("Not Proper name");
		}
		try {
			p.setName(name);
			p.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
			productsRepo.save(p);
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
