package com.pgrms.PgRentalServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgrms.PgRentalServices.Entities.Wishlist;
@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Integer>{

}
