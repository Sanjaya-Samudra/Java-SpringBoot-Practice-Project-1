package edu.icet.crm.product.controller;

import edu.icet.crm.product.model.Product;
import edu.icet.crm.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/save-product")
    void saveProduct(@RequestBody Product product){
        service.saveProduct(product);
    }

}
