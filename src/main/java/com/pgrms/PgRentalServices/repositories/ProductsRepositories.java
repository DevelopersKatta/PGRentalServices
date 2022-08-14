package com.pgrms.PgRentalServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgrms.PgRentalServices.Entities.Products;

@Repository
public interface ProductsRepositories extends JpaRepository<Products, Integer>{

}
