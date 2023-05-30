package com.poly.bai2.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="images")
	private String images;
	
	@Column(name="price")
	private double price;
	
	@Column(name="creata_Data")
	private Date creata_Data;
	
	@Column(name="available")
	private int available;
	
	
	
}
