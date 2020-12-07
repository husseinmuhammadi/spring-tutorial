package com.javastudio.tutorial.spring;

import com.javastudio.tutorial.spring.api.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.INSTANCE.getContext();
        Arrays.stream(context.getBeanDefinitionNames()).forEach(LOGGER::info);
        ProductService productService = context.getBean(ProductService.class);
        productService.findAll();
    }
}
