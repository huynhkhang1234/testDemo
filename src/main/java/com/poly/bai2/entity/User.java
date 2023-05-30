package com.poly.bai2.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name="user")
public class User {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="username")
	private String username;

	@Column(name="passWord")
	private String passWord;

	@Column(name="email")
	private String email;

	@Column(name="photo")
	private String photo;

	@Column(name="activated")
	private Integer activated;

	@Column(name="admin")
	private Integer admin;
	
	@OneToMany(mappedBy = "user")
	private List<Order> order;
	
	
}
