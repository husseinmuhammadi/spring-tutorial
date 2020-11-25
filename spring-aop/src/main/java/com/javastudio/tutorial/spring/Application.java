package com.javastudio.tutorial.spring;

import com.javastudio.tutorial.spring.api.ProductService;
import com.javastudio.tutorial.spring.service.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ProductServiceImpl productService = context.getBean(ProductServiceImpl.class);
        ProductService productService = (ProductServiceImpl) context.getBean("ps");
        productService.findAllProducts();
        //productService.findProduct(1L);
    }
}
