package com.demo.rest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produk")
public class Produk {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nama", length = 50, unique = true, nullable = false)
	private String nama;
	
	@Column(name = "hargaBeli", nullable = false)
	private Float hargaBeli;
	
	@Column(name = "hargaJual", nullable = false)
	private Float hargaJual;
	
	public Produk () {}

	public Produk(String nama, Float hargaBeli, Float hargaJual) {
		this.nama = nama;
		this.hargaBeli = hargaBeli;
		this.hargaJual = hargaJual;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public Float getHargaBeli() {
		return hargaBeli;
	}
	public void setHargaBeli(Float hargaBeli) {
		this.hargaBeli = hargaBeli;
	}
	public Float getHargaJual() {
		return hargaJual;
	}
	public void setHargaJual(Float hargaJual) {
		this.hargaJual = hargaJual;
	}
	
	
}
