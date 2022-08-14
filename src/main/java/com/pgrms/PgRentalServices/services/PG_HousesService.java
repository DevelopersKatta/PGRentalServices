package com.pgrms.PgRentalServices.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgrms.PgRentalServices.Entities.PG_Houses;
import com.pgrms.PgRentalServices.repositories.PG_HousesRepository;

@Service
@Transactional
public class PG_HousesService {

	@Autowired
	private PG_HousesRepository repo;

//	method for retrieving the data from the database 
	public List<PG_Houses> listAll() {
		return repo.findAll();
	}

//	method for retrieving the one data from database by id
	public PG_Houses getPGHousesById(int id) {
		return repo.findAll().stream().filter(s -> s.getPg_id() == id).findFirst().get();
	}

//	method for saving the house in the database
	public void savePGHouse(PG_Houses pg) {
		repo.save(pg);
	}

//	method for deleting the house from database
	public void deletePGHouseById(int id) {
		repo.deleteById(id);
	}

//	method for updating the house in the database
	public void updateHouseById(int id, PG_Houses pg) {
		PG_Houses tempHouse = repo.findById(id).get();
		tempHouse.setPg_name(pg.getPg_name());
		tempHouse.setPg_address(pg.getPg_address());
		tempHouse.setPg_city(pg.getPg_city());
		tempHouse.setPg_description(pg.getPg_description());
		tempHouse.setPg_house_type(pg.getPg_house_type());
		tempHouse.setPg_status(pg.getPg_status());
		tempHouse.setPg_rent_price(pg.getPg_rent_price());
		tempHouse.setPg_photo(pg.getPg_photo());
		repo.save(tempHouse);
	}

// public void save(Product product) {
//     repo.save(product);
// }
//  
// public Product get(Integer id) {
//     return repo.findById(id).get();
// }
//  
// public void delete(Integer id) {
//     repo.deleteById(id);
// }
}
