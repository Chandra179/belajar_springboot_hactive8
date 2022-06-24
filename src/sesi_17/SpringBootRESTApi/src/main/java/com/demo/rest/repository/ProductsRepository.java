package com.demo.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.rest.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {
	List<Products> findAllByName(String name);

	Products findProductsById(Long id);

}
