package com.javastudio.tutorial.spring.api;

import com.javastudio.tutorial.spring.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

}
