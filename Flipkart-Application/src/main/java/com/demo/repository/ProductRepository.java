package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
	
	@Query(value="SELECT * FROM product WHERE product_name = ?1", nativeQuery=true)
	Product getProductByName(String name);

}
