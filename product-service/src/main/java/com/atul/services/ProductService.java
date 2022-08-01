package com.atul.services;
import java.util.Optional;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.atul.models.Product;

@WebService
public class ProductService {

	private ProductDAO dao = ProductDAO.getInstance();
	
	@WebMethod
	public Product find(String name) {
		Optional<Product> result = dao.find(name);
		if(result.isPresent())
			return result.get();
		else return null;
	}
	
	@WebMethod 
	public String create(Product product) {
		dao.add(product);
		return "Success";
	}
}

