package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Product;
import com.demo.repository.ProductRepository;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		Product p = productRepository.save(product);
		return p;
	}

	@Override
	public Product getProductById(long id) {
		Product p = productRepository.findById(id).get();
		return p;
	}

	@Override
	public List<Product> getListOfProduct() {
		List<Product> productList = productRepository.findAll();
		return productList;
	}

	@Override
	public void updatedProductById(Product product, long id) {
		Product productToUpdate = productRepository.findById(id).get();
		productToUpdate.setProduct_Name(product.getProduct_Name());
		productToUpdate.setProduct_Price(product.getProduct_Price());
		productRepository.save(productToUpdate);

	}


	@Override
	public void deleteProductById(long id) {
		productRepository.deleteById(id);

	}

	@Override
	public void deleteAllProductList() {
		productRepository.deleteAll();

	}

	@Override
	public Product searchProductByName(String name) {
		Product p = productRepository.getProductByName(name);
		return p;
	}

}
