package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.app.repo.ProductRepository;

public class AppRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		Intcount=repo.removeData(2);
		System.out.println(Count);
	}
		}

	
