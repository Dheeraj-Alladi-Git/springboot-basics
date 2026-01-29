package com.dheeraj.training.springboot_basics.Service;

import com.dheeraj.training.springboot_basics.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts(){
        return products;

    }

    public Product addProduct(Product prod) {
        products.add(prod);
        return prod;
    }

    public void deleteProduct(int proId){
        for(Product product : products){
            if(product.getProductId() == proId){
                products.remove(product);
                return;
            }
        }
    }

    public Product getProductById(int id) {
        for(Product product : products){
            if(product.getProductId() == id){
              return product;
            }
        }
        return null;
    }

}
