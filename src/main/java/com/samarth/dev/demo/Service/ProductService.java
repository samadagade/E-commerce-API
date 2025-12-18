// package com.samarth.dev.demo.Service;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// import org.springframework.stereotype.Service;

// import com.samarth.dev.demo.Model.Product;

// @Service
// public class ProductService {
//     List<Product> products = new ArrayList<>(Arrays.asList(
//             new Product(101, "Laptop", 50000),
//             new Product(102, "Smartphone", 25000),
//             new Product(103, "Headphones", 2000)));

//     public List<Product> getProducts() {
//         return products;
//     }

//     public Product getProductById(int id) {

//         for (Product item : products) {
//             if (item.getId() == id) {
//                 return item;
//             }
//         }

//         return new Product(0, "No Product Found", 0);
//     }

//     public void addProduct(Product item) {
//         products.add(item);
//     }

//     public void updateProduct(Product item) {
//         for (int index = 0; index < products.size(); index++) {
//             if(products.get(index).getId() == item.getId()){
//                 products.set(index, item);
//             }
//         }
//     }

//     public void deleteProduct(int id) {
//         for (int index = 0; index < products.size(); index++) {
//             if(products.get(index).getId() == id){
//                 products.remove(index);
//             }
//         }
//     }
// }


package com.samarth.dev.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samarth.dev.demo.Model.Product;
import com.samarth.dev.demo.Repo.ProductRepository;

@Service
public class ProductService {
   
     @Autowired
     ProductRepository repo;

    
    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());
    }

    public void addProduct(Product item) {
        repo.save(item);
    }

    public void updateProduct(Product item) {
        repo.save(item);
    }

    public void deleteProduct(int id) {
       System.out.println(id);
       repo.deleteById(id);
    }
}
