package com.javastudio.tutorial.spring;

import com.javastudio.tutorial.spring.service.ProductServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LOGGER.info("{}", context.getBean("productService").getClass().getName());

        if (context.getBean("productService") instanceof ProductServiceImpl) {
            ProductServiceImpl productService = (ProductServiceImpl) context.getBean("productService");
            productService.findAllProducts();
            productService.findProduct(1L);
        }
    }
}
