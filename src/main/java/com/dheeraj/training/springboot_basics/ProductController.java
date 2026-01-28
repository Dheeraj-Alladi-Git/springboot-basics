package com.dheeraj.training.springboot_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }


    @GetMapping("/GetProduct/{id}")
    public Product getProductById(@PathVariable int id){

    }

}
