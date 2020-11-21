package com.javastudio.tutorial.spring.model;

import java.util.Date;

public class Product {
    String name;
    Date expiryDate;
    int length;

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    static class ProductBuilder {
        private String name;
        private Date expiryDate;
        private int length;

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder expiryDate(Date expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public ProductBuilder length(int length) {
            this.length = length;
            return this;
        }

        public Product build() {
            Product product = new Product();
            product.setName(this.name);
            product.setExpiryDate(this.expiryDate);
            product.setLength(this.length);
            return product;
        }
    }
}
