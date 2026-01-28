package com.dheeraj.training.springboot_basics;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(12, "Hyundai", 10000),
            new Product(11, "TATA", 5000)
    );

    public List<Product> getAllProducts(){
        return products;

    }
}
