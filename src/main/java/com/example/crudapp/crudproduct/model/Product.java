package com.example.crudapp.crudproduct.model;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	@Id
	String id;
	String name;
	int    price;
	//description 
	String desc;
	//date d'expiration
	Date   expDate;
	
	
	public Product (String name, int price, String desc, Date expDate ) {
		this.name=name;
		this.price=price;
		this.desc=desc;
		this.expDate=expDate;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public Date getExpDate() {
		return expDate;
	}


	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	
	public String toString() {
		return " Product Name:"+name+" Product Price :"+price+"Description:"+desc+"Experation Date:"+expDate;
	}
	
	

}
