package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Product;
import com.demo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService ProductService;

	@PostMapping(value = "/addProduct")
	Product addProduct(@RequestBody Product product) {
		Product p = ProductService.createProduct(product);
		return p;
	}
	
	@GetMapping(value="/getlistofProducts") 
	List<Product> getListOfProducts(){   //throws ProductNotfoundException{

		List<Product> resutedlist = ProductService.getListOfProduct();
		return resutedlist;

	}
	
	@GetMapping(value="/getProductbyid/{id}") 
	Product getProductById(@PathVariable long id) {// throws ProductNotfoundException{
		Product d = ProductService.getProductById(id);
		return d;
	}
	

	@PutMapping(value="/updateProductById/{id}") 
	public String updateProductById(@RequestBody Product product, @PathVariable long id) {// throws ProductNotfoundException{

		ProductService.updatedProductById(product, id);
		return "Product updated successfully";
	}
	
	@DeleteMapping(value="/deleteProductById/{id}") 
	public String deleteProductById( @PathVariable long id) {// throws ProductNotfoundException{

		ProductService.deleteProductById(id);
		return "deleted the Product successfully";
	}
	
	@DeleteMapping(value="/deleteAllProducts") 
	public String deleteAllProducts() {// throws ProductNotfoundException{

		ProductService.deleteAllProductList();
		return "deleted all the Products successfully";
	}
	
	@GetMapping(value="/getProductByName/{name}") 
	Product getProductByName(@PathVariable String name) {// throws ProductNotfoundException{
		Product d = ProductService.searchProductByName(name);
		return d;
	}

}
