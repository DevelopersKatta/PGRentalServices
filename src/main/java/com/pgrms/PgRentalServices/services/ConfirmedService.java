package com.pgrms.PgRentalServices.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgrms.PgRentalServices.Entities.Confirmed;
import com.pgrms.PgRentalServices.repositories.ConfirmedRepository;

@Service
@Transactional
public class ConfirmedService {
	
	@Autowired
	ConfirmedRepository repo;

//	method for retrieving the data from the database 
	public List<Confirmed> listAll() {
		return repo.findAll();
	}

//	method for retrieving the one data from database by id
	public Confirmed getConfirmedById(int id) {
		return repo.findAll().stream().filter(s -> s.getcfm_id() == id).findFirst().get();
	}

//	method for saving the Confirmed in the database
	public void saveConfirmed(Confirmed rq) {
		repo.save(rq);
	}

//	method for deleting the Confirmed from database
	public void deleteConfirmedById(int id) {
		repo.deleteById(id);
	}

//	method for updating data in the database
	public void updateConfirmedById(int id, Confirmed pg) {
		Confirmed tempConfirmed = repo.findById(id).get();
		tempConfirmed.setOwner_id(pg.getOwner_id());
		tempConfirmed.setSeeker_id(pg.getSeeker_id());
		tempConfirmed.setPg_house_id(pg.getPg_house_id());
		repo.save(tempConfirmed);
	}
}