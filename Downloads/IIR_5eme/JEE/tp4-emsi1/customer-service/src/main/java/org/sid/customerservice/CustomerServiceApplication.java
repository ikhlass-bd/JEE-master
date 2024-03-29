package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.saveAll(List.of(
				Customer.builder().name("ikhlass").email("ik_bd@gmail.com").build(),
					Customer.builder().name("rym").email("ik_rym@gmail.com").build(),
					Customer.builder().name("sami").email("ik_sami@gmail.com").build()
			));
			customerRepository.findAll().forEach(System.out::println);

		};
}}