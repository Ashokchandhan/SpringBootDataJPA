package com.app.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	@Modifying
	@Transactional
	
	
	@Query("update product p set p.productCost=:cost where p.prodId=:id")
			public int updateCost(Double cost(Double cost,Integer Id);
			@Modifying
			@Transactional
				
	@Query("delete from product p where p.prodd=:Id")
			public int removeData(Integer Id);
	
	}
