package com.javastudio.tutorial.spring.service;

import com.javastudio.tutorial.spring.api.ProductService;
import com.javastudio.tutorial.spring.repository.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductServiceImpl implements ProductService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    public ProductServiceImpl() {
        LOGGER.info("ProductServiceImpl#ctor");
    }

    @Override
    public void findAllProducts() {
        LOGGER.info("ProductServiceImpl#findAllProducts");
    }

    public Product findProduct(long id) {
        LOGGER.info("ProductServiceImpl#findProduct");
        return new Product();
    }
}
