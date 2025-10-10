package com.jsp.clickNBuy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.clickNBuy.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	boolean existsByEmail(String email);

	boolean existsByMobile(Long mobile);
	
	Optional<User> findByEmail(String email);
}
