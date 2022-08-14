package com.pgrms.PgRentalServices.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgrms.PgRentalServices.Entities.Requests;
import com.pgrms.PgRentalServices.repositories.RequestsRepository;

@Service
@Transactional
public class RequestsService {

	@Autowired
	RequestsRepository repo;

//	method for retrieving the data from the database 
	public List<Requests> listAll() {
		return repo.findAll();
	}

//	method for retrieving the one data from database by id
	public Requests getRequestById(int id) {
		return repo.findAll().stream().filter(s -> s.getRq_id() == id).findFirst().get();
	}

//	method for saving the request in the database
	public void saveRequest(Requests rq) {
		repo.save(rq);
	}

//	method for deleting the request from database
	public void deleteRequestById(int id) {
		repo.deleteById(id);
	}

//	method for updating the request in the database
	public void updateRequestById(int id, Requests pg) {
		Requests tempRequest = repo.findById(id).get();
		tempRequest.setOwner_id(pg.getOwner_id());
		tempRequest.setSeeker_id(pg.getSeeker_id());
		tempRequest.setPg_house_id(pg.getPg_house_id());
		repo.save(tempRequest);
	}
}
