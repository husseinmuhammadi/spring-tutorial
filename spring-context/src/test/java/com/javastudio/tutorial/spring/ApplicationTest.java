package com.javastudio.tutorial.spring;

import com.javastudio.tutorial.spring.model.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class ApplicationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationTest.class);

    static ApplicationContext context;

    @BeforeAll
    static void beforeAll() {
        LOGGER.info("Spring context is starting to be initialized!");
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LOGGER.info("Spring context is initialized!");
    }

    @Test
    void whenCreateProductObject_thenProductObjectMustCreate() {
        Product product = new Product();
        Assertions.assertThat(product).isNotNull();
    }

    @Test
    void whenGetBeanFromSpringContext_thenItShouldBeExists() {
        Object object = context.getBean("x");
        Assertions.assertThat(object.getClass().getSimpleName()).isEqualTo("Product");
    }
}
