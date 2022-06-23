package com.demo.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/v1")
public class ProdukController {

	private final static Logger LOGGER = LoggerFactory.getLogger(ProdukController.class.getName());

	@Autowired
	ProdukRepository produkRepository;

	@GetMapping("/produk")
	public ResponseEntity<List<Produk>> getAllProduk(@RequestParam(required = false) Long id) {

		try {
			List<Produk> produk = new ArrayList<Produk>();

			if (id == 0)
				produkRepository.findAll().forEach(produk::add);
			else
				produkRepository.findById(id).ifPresent(produk::add);

			if (produk.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(produk, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/produk/{id}")
	public ResponseEntity<Produk> getProdukById(@PathVariable("id") long id) {
		Optional<Produk> produkData = produkRepository.findById(id);

		if (produkData.isPresent()) {
			return new ResponseEntity<>(produkData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

//	@GetMapping("/produk/{nama}")
//	public ResponseEntity<Produk> getProdukById(@PathVariable("nama") String nama) {
//		Optional<Produk> produkData = produkRepository.findByNama(nama);
//
//		if (produkData.isPresent()) {
//			return new ResponseEntity<>(produkData.get(), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}

	@PostMapping("/produk")
	public ResponseEntity<String> createProduk(@RequestBody Produk produk) {
		try {
			Produk _produk = produkRepository
					.save(new Produk(produk.getNama(), produk.getHargaBeli(), produk.getHargaJual()));
			return new ResponseEntity<>(_produk.getNama(), HttpStatus.CREATED);
		} catch (Exception e) {
			String msg = "Failed add product : " + e.getMessage();
			HttpStatus statusCode = HttpStatus.INTERNAL_SERVER_ERROR;
			return new ResponseEntity<>(msg, statusCode);
		}
	}

	@PutMapping("/produk/{id}")
	public ResponseEntity<Produk> updateProduk(@PathVariable("id") long id, @RequestBody Produk produk) {
		Optional<Produk> produkData = produkRepository.findById(id);

		if (produkData.isPresent()) {
			Produk _produk = produkData.get();
			_produk.setNama(produk.getNama());
			_produk.setHargaBeli(produk.getHargaBeli());
			_produk.setHargaJual(produk.getHargaJual());
			return new ResponseEntity<>(produkRepository.save(_produk), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/produk/{id}")
	public ResponseEntity<HttpStatus> deleteProduk(@PathVariable("id") long id) {
		try {
			produkRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/produk")
	public ResponseEntity<HttpStatus> deleteAllProduk() {
		try {
			produkRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}

