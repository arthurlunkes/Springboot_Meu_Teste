package com.arthurlunkes.primeiroAppUsandoSpring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.arthurlunkes.primeiroAppUsandoSpring.entities.Order;
import com.arthurlunkes.primeiroAppUsandoSpring.entities.User;
import com.arthurlunkes.primeiroAppUsandoSpring.repositories.OrderRepository;
import com.arthurlunkes.primeiroAppUsandoSpring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Arthur Lunkes", "arthur.lunkes2017@gmail.com", "9999999999","123456");
		User u2 = new User(null, "Teste Lunkes", "arthur.lunkes2@gmail.com", "9999999998","123456");
		
		Order o1 = new Order(null, Instant.parse("2022-12-09T13:55:00Z"), u1);
		Order o2 = new Order(null, Instant.parse("2021-12-09T13:55:00Z"), u2);
		Order o3 = new Order(null, Instant.parse("2021-12-09T13:55:00Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
}
