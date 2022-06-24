package com.demo.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.rest.entity.Products;
import com.demo.rest.repository.ProductsRepository;
import com.demo.rest.service.ProductsService;

@Service
public class ProductServiceImpl implements ProductsService {

	@Autowired
	private ProductsRepository productsRepository;

	@Override
	public List<Products> findAllProducts() {
		// TODO Auto-generated method stub
		return productsRepository.findAll();
	}

	@Override
	public List<Products> findAllProductsByName(String name) {
		// TODO Auto-generated method stub
		return productsRepository.findAllByName(name);
	}

	@Override
	public Products findProductById(Long id) {
		// TODO Auto-generated method stub
		return productsRepository.findProductsById(id);
	}

	@Override
	public Products saveProduct(Products product) {
		// TODO Auto-generated method stub
		return productsRepository.save(product);
	}

	@Override
	public void deleteProductById(Long id) {
		// TODO Auto-generated method stub
		productsRepository.deleteById(id);

	}

}
