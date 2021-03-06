package com.javastudio.tutorial.spring.service;

import com.javastudio.tutorial.spring.api.ProductService;
import com.javastudio.tutorial.spring.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class ProductServiceImpl extends GeneralServiceBase implements ProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public List<Product> findAll() {
        LOGGER.info("ProductServiceImpl#findAll");
        return new ArrayList<>();
    }

    @Override
    public Product findById(long id) {
        LOGGER.info("ProductServiceImpl#findById");
        return new Product();
    }

    public List<Product> findByParams(List<Predicate<Product>> predicates) {
        try {
            //...
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
