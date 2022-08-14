package com.pgrms.PgRentalServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgrms.PgRentalServices.Entities.Confirmed;

@Repository
public interface ConfirmedRepository extends JpaRepository<Confirmed, Integer> {

}
