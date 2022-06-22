package com.csi.controller;

import com.csi.model.Product;
import com.csi.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductServiceImpl productServiceImpl;

    @PostMapping("/savedata")
    public Product saveData(@RequestBody Product product){
        return productServiceImpl.saveData(product);

    }

    @GetMapping("/getalldata")
    public List<Product> getAllData(){
        return productServiceImpl.getAllData();
    }

}
