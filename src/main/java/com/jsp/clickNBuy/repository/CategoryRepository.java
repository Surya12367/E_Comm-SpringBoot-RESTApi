package com.jsp.clickNBuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.clickNBuy.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	boolean existsByName(String name);

	Category findByName(String category);

}
