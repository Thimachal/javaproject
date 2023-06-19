package com.devthima.mynewproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devthima.mynewproject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
