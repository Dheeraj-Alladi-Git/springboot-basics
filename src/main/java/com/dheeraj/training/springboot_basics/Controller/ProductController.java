package com.dheeraj.training.springboot_basics.Controller;

import com.dheeraj.training.springboot_basics.Product;
import com.dheeraj.training.springboot_basics.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products = service.getAllProducts();
        if(products.isEmpty()){
            return new ResponseEntity<>(products, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);

    }

    @GetMapping("/getProduct/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        Product product = service.getProductById(id);
        if(product == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(product);
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product prod) {
        Product product = service.addProduct(prod);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }


    // localhost:8080/deleteProduct/1
    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
    }

}
