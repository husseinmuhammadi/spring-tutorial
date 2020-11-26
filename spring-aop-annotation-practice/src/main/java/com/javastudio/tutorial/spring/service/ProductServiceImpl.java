package com.javastudio.tutorial.spring.service;

import com.javastudio.tutorial.spring.api.ProductService;
import com.javastudio.tutorial.spring.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductServiceImpl extends ServiceBase implements ProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public List<Product> findAll() {
        LOGGER.info("ProductServiceImpl#findAll");
        return new ArrayList<>();
    }
}
