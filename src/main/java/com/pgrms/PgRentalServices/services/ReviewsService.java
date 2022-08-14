package com.pgrms.PgRentalServices.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgrms.PgRentalServices.Entities.Reviews;
import com.pgrms.PgRentalServices.repositories.ReviewsRepository;

@Service
@Transactional
public class ReviewsService {

	@Autowired
	ReviewsRepository repo;

//	method for retrieving the data from the database 
	public List<Reviews> listAll() {
		return repo.findAll();
	}

//	method for retrieving the one data from database by id
	public Reviews getReviewsById(int id) {
		return repo.findAll().stream().filter(s -> s.getRv_id() == id).findFirst().get();
	}

//	method for saving the Reviews in the database
	public void saveReviews(Reviews rq) {
		repo.save(rq);
	}

//	method for deleting the Reviews from database by id
	public void deleteReviewsById(int id) {
		repo.deleteById(id);
	}

//	method for updating data in the database
	public void updateReviewsById(int id, Reviews rv) {
		Reviews tempReviews = repo.findById(id).get();
		tempReviews.setTime(rv.getTime());
		tempReviews.setSeeker_id(rv.getSeeker_id());
		tempReviews.setOwner_id(rv.getOwner_id());
		tempReviews.setPg_house_id(rv.getPg_house_id());
		tempReviews.setComments(rv.getComments());
		repo.save(tempReviews);
	}
}
