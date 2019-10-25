package com.example.crudapp.crudproduct.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.example.crudapp.crudproduct.model.Product;
import com.example.crudapp.crudproduct.service.ProductService;


@CrossOrigin(origins = "http://localhost:4200")



@RestController
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String name, @RequestParam int price, @RequestParam String desc, @RequestParam Date expDate) {
		Product p = productService.create(name, price,desc, expDate);
		return p.toString();
	}
	
	@RequestMapping("/get")
	public Product getProduct(@RequestParam String name) {
		return productService.getByName(name);
	}
	@RequestMapping("/getAll")
	public List<Product> getAll(){
		return productService.getAll();
	}
	@RequestMapping("/update")
	public String update(@RequestParam String name, @RequestParam int price, @RequestParam String desc, @RequestParam Date expDate) {
		Product p = productService.update(name,price,desc,expDate);
		return p.toString();
	}
	@RequestMapping("/delete")
	public String delete(String name) {
		productService.delete(name);
		return "Deleted"+name;
	}
	@RequestMapping("deleteAll")
	public String deleteAll () {
		productService.deleteAll();
		return "All records have been Deleted";
	}
	

}
