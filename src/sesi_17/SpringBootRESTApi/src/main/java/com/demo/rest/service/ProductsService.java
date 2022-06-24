package com.demo.rest.service;

import java.util.List;


import com.demo.rest.entity.Products;

public interface ProductsService {
	List<Products> findAllProducts(); // menampilkan semua product

	List<Products> findAllProductsByName(String name); // mencari product bedasarkan nama
	// select * from tb_product where name = ?1
	// select * from tb_product where name = ?1 and harga = ?2

	Products findProductById(Long id);

	Products saveProduct(Products product);

	void deleteProductById(Long id);
}
