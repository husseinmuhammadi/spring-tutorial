package com.javastudio.tutorial.spring;

import com.javastudio.tutorial.spring.api.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.INSTANCE.getContext();
        ProductService productService = context.getBean(ProductService.class);
        productService.findAll();
    }
}
