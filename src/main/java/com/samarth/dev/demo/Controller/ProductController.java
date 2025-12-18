package com.samarth.dev.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.samarth.dev.demo.Model.Product;
import com.samarth.dev.demo.Service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

//example by MVC
@CrossOrigin("*")
@RestController
public class ProductController {

    @Autowired
    ProductService service;

    // @RequestMapping("/products")
    // @RequestMapping("path", method=RequestMethod.GET)
    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product item) {
        service.addProduct(item);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product item) {
        service.updateProduct(item);
    }

   @DeleteMapping("/products/{id}")
   public void deleteProduct(@PathVariable int id){
       service.deleteProduct(id);
   }
}
