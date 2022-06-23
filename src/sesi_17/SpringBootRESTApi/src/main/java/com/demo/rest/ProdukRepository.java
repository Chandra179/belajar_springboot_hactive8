package com.demo.rest;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdukRepository extends JpaRepository<Produk, Long> {

	@Query(nativeQuery = true, value = "select * from book where nama = ?")
	Optional<Produk> findByNama(String nama);

}
