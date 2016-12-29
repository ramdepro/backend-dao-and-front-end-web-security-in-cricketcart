package com.niit.cricketbackend.dao;

import java.util.List;

import com.niit.Cricketbakend.model.Product;

public interface ProductDAO {

	
	public void addProduct(Product product);
	public void updateProduct(Product product);
	
	public void deleteProduct(Product product);
	
	
	public Product getProductById(int id);
	
	public List<Product> listProducts();
	public Product  getProductById1(int id);
	
	public List<Product> getProductsByCategory(String category);

}
