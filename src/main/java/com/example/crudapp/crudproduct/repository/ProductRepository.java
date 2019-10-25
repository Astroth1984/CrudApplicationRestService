package com.example.crudapp.crudproduct.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.crudapp.crudproduct.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
	public Product findByName ( String name);
	public List<Product> findByPrice ( int price);
	public List<Product> findByDate (Date expDate); 

}
