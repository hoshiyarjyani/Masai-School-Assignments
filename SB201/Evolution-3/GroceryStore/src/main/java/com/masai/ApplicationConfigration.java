package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class ApplicationConfigration {
@Bean
 public Product fruits() {
	return new Fruits("mango",1.0,5);
	
}

@Bean
public Product vegetables() {
    return new Vegetables("Broccoli", 0.5, 3);
}

@Bean
public Product bakery() {
    return new Bakery("Samosa", 2.0, 2);
}

@Bean
public ProductService productService() {
    return new ProductServiceImpl();
}
@Bean
public ShoppingCart shoppingCart() {
    return new ShoppingCart();
}

}
