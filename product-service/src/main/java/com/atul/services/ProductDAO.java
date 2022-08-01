package com.atul.services;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import com.atul.models.Product;

public class ProductDAO {
	private static ProductDAO dao = new ProductDAO();
	public static ProductDAO getInstance() {
		return dao;
	}
	
	private ProductDAO() { } // Cannot initialized from outside !
	
	private List<Product> productList = new LinkedList<Product>();
	
	public void add(Product p) {
		System.out.println("ProductDAO:Add  => Adding new product "+p.getName());
		productList.add(p);
	}
	
	public Optional<Product> find(String name) {
		return productList.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findFirst();
	}

}
