package com.devthima.mynewproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devthima.mynewproject.entities.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
