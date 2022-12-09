package com.arthurlunkes.primeiroAppUsandoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurlunkes.primeiroAppUsandoSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
	
}
