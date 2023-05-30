package com.poly.bai2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.poly.bai2.entity.User;
@Service
public interface UserRepository  extends JpaRepository<User, Integer> {
	
}
