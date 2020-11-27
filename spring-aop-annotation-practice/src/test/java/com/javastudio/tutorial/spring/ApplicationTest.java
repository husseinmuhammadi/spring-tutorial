package com.javastudio.tutorial.spring;

import com.javastudio.tutorial.spring.api.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

class ApplicationTest {
    @Test
    void whenCallFindAll_thenAdviceShouldPrintLog() {
        ApplicationContext context = SpringApplication.INSTANCE.getContext();
        ProductService productService = context.getBean(ProductService.class);
        productService.findAll();
    }

    @Test
    void whenCallFindById_thenAdviceShouldShouldPrintLog() {
        ApplicationContext context = SpringApplication.INSTANCE.getContext();
        ProductService productService = context.getBean(ProductService.class);
        productService.findById(1);
    }
}