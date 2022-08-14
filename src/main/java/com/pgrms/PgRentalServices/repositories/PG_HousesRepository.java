package com.pgrms.PgRentalServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgrms.PgRentalServices.Entities.PG_Houses;
@Repository
public interface PG_HousesRepository extends JpaRepository<PG_Houses, Integer>{

}
