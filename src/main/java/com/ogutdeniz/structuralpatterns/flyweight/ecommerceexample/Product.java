package com.ogutdeniz.structuralpatterns.flyweight.ecommerceexample;

import java.math.BigDecimal;

public class Product {
    private String name; // This is the intrinsic state
    private BigDecimal price; // This is the intrinsic state
    private String description; // This is the intrinsic state
    private String manufacturer; // This is the intrinsic state

    public Product(String name, BigDecimal price, String description, String manufacturer) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}