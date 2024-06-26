package com.bookstore.dao;

import com.bookstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepositry extends JpaRepository<Product, Long> {
	
	List<Product> findByNameContainingIgnoreCase(String name);
	@Query("SELECT DISTINCT brand FROM Product")
	List<String> findAllBrandsDistincts();
}
