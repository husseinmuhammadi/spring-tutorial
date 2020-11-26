package com.javastudio.tutorial.spring;

import com.javastudio.tutorial.spring.api.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    void name() {
        ApplicationContext context = SpringApplication.INSTANCE.getContext();
        ProductService productService = context.getBean(ProductService.class);
        productService.findAll();
    }
}