package com.javastudio.tutorial.spring;

import com.javastudio.tutorial.spring.model.Product;
import com.javastudio.tutorial.spring.service.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ProductServiceImpl productService = context.getBean("productService", ProductServiceImpl.class);
        System.out.println(productService.getClass().getName());

        Product product = (Product) context.getBean("product");
        System.out.println(product.getName());
    }
}
