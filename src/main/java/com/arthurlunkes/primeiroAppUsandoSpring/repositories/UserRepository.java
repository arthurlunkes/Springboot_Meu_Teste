package com.arthurlunkes.primeiroAppUsandoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurlunkes.primeiroAppUsandoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
