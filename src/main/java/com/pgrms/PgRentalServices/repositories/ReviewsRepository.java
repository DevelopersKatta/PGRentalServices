package com.pgrms.PgRentalServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgrms.PgRentalServices.Entities.Reviews;
@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Integer>{
	
}
