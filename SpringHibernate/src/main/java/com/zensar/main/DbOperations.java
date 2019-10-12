package com.zensar.main;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zensar.entities.Product;
import com.zensar.services.ProductService;
import com.zensar.services.ProductServiceImpl;

public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("dbconfig.xml");
        ProductService productService = context.getBean("productServiceImpl",ProductService.class);
        List<Product> product = productService.findAllProducts();
        for(Product p:product) {
        	System.out.println(p);
        }
       /* Product product1 = productService.findProductById(1004);
        if(product1!=null) {
        	product1.setProductId(1001);
        	productService.updateProduct(product1);
        	
        }else {
        	System.out.println("product not found");
        }
       // System.out.println(product1);
        Product product2 = new Product(1001, "mobile", "Mi",7500);
        productService.addProduct(product2);*/
        
       /* Product product1 = productService.findProductById(1010);
        if(product1!=null) {
        	
        	productService.removeProduct(product1);
        	
        }else {
        	System.out.println("product not found");
        }*/
                   
	}

}
