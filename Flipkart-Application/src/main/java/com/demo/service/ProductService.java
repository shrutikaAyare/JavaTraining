package com.demo.service;

import java.util.List;
import com.demo.entity.Product;

public interface ProductService {
	
	Product createProduct(Product product) ;

	void updatedProductById(Product product,long id) ;

	Product getProductById(long id);

	List<Product> getListOfProduct();

	void deleteProductById(long id);

	void deleteAllProductList();
	
	Product searchProductByName(String name) ;
	//Integer Otplogin(int number);

}
