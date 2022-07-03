package com.demo.client;

import java.util.List;

import com.demo.entity.Product;

import com.demobusinesslogic.ProductRepo;

public class ProductManage {

	public static void main(String[] args) {

//		Product record1 = new Product("sam","fair","red");
//		Product record2 = new Product("iphone","good","red");
//		ProductRepo.createProduct(record1);
//		ProductRepo.createProduct(record2);
		System.out.println("done");
		
		 System.out.println("---------------------------");
		 
	    List<Product> productList = ProductRepo.viewProduct();
	    System.out.println("emp size: "+ productList.size());
	    productList.stream().forEach(System.out::println);
	    
	    if(productList != null & productList.size() > 0) {
            for(Product proc : productList) {
            	System.out.println(proc.toString());
            }
        }
	    
	    
	    System.out.println("\n=======UPDATE RECORDS=======\n");
        Long updateId = (long) 24;
        ProductRepo.updateRecord(updateId);
        System.out.println("\n=======READ RECORDS AFTER UPDATION=======\n");
        List <Product> updateProduct = ProductRepo.viewProduct();
        if(updateProduct != null & updateProduct.size() > 0) {
            for(Product prc : updateProduct) {
            	System.out.println(prc.toString());
            }
        }
 
        System.out.println("\n=======DELETE RECORD=======\n");
        Long deleteId = (long) 27;
        ProductRepo.deleteRecord(deleteId);
        System.out.println("\n=======READ RECORDS AFTER DELETION=======\n");
        List <Product>deleteProductRecord = ProductRepo.viewProduct();
        for(Product prc : deleteProductRecord) {
        	System.out.println(prc.toString());
        }
	         

	}

}