package com.belajar.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "tb_user")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	public User() {

	}

	public User(Long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

}