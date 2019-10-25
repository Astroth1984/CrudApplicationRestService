package com.example.crudapp.crudproduct.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudapp.crudproduct.model.Product;
import com.example.crudapp.crudproduct.repository.ProductRepository;



@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepository productRepository;
	
	
	//Create operation
	public Product create(String name, int price, String desc, Date expDate) {
		return productRepository.save(new Product(name,price,desc,expDate));
	}
	
	//Retrieve operation
	public List<Product> getAll(){
		return productRepository.findAll();
	}
	public Product getByName( String name) {
		return productRepository.findByName(name);
	}
	// Update operation
	public Product update(String name, int price, String desc, Date expDate) {
		Product p = productRepository.findByName(name);
		p.setPrice(price);
		p.setDesc(desc);
		p.setExpDate(expDate);
		return productRepository.save(p);
	}
	//Delete operation
	public void deleteAll() {
		productRepository.deleteAll();
	}
	public void delete( String name) {
		Product p = productRepository.findByName(name);
		productRepository.delete(p);
	}

}
