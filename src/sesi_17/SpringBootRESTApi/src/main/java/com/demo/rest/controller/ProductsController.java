package com.demo.rest.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo.rest.entity.Products;
import com.demo.rest.repository.ProductsRepository;
import com.demo.rest.service.ProductsService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/v1")
public class ProductsController {

	@Autowired
	private ProductsRepository produkRepository;

	@Autowired
	private ProductsService produkService;

	@GetMapping("/products")
	public List<Products> findAllProducts() {
		return produkRepository.findAll();
	}

	@PostMapping("/products")
	public Products saveProducts(@RequestBody Products product) {
		return produkService.saveProduct(product);
	}

	@GetMapping("/products/name/{name}")
	public List<Products> findAllProductsByName(@PathVariable String name) {
		return produkService.findAllProductsByName(name);
	}

	@DeleteMapping("/products/id/{id}")
	public void deleteById(@PathVariable Long id) {
		produkService.deleteProductById(id);
	}

	@CrossOrigin
	@PutMapping("/products")
	public ResponseEntity<?> updateProductById(@RequestBody Products product, @RequestParam Long id) {

		try {
			Products checkProduct = produkService.findProductById(id);
			if (checkProduct.getId() != id) {
				return new ResponseEntity<>("ID Data produk tidak sesuai", HttpStatus.OK);
			}
			product.setId(id);
			produkService.saveProduct(product);

			// update from tb_product set name="Acer", hargaBeli=500, hargaJual=501
			// where id=?1

			return new ResponseEntity<>("Berhasil simpan produk", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("Terjadi kesalahan" + e.getMessage(), HttpStatus.OK);
		}
	}

}

