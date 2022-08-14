package com.pgrms.PgRentalServices.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgrms.PgRentalServices.Entities.Wishlist;
import com.pgrms.PgRentalServices.repositories.WishlistRepository;

@Service
@Transactional
public class WishlistService {

	@Autowired
	WishlistRepository repo;

//	method for retrieving the data from the database 
	public List<Wishlist> listAll() {
		return repo.findAll();
	}

//	method for retrieving the one data from database by id
	public Wishlist getWishlistById(int id) {
		return repo.findAll().stream().filter(s -> s.getWl_id() == id).findFirst().get();
	}

//	method for saving the Wishlist in the database
	public void saveWishlist(Wishlist rq) {
		repo.save(rq);
	}

//	method for deleting the Wishlist from database
	public void deleteWishlistById(int id) {
		repo.deleteById(id);
	}

//	method for updating data in the database
	public void updateWishlistById(int id, Wishlist pg) {
		Wishlist tempWishlist = repo.findById(id).get();
		tempWishlist.setTime(pg.getTime());
		tempWishlist.setSeeker_id(pg.getSeeker_id());
		tempWishlist.setPg_house_id(pg.getPg_house_id());
		repo.save(tempWishlist);
	}
}
