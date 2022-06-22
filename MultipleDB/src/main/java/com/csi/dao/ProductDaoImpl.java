package com.csi.dao;

import com.csi.model.Customer;
import com.csi.model.Product;
import com.csi.repo.product.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDaoImpl {
    @Autowired
    ProductRepo productRepoImpl;

    public Product saveData(Product product){
        return  productRepoImpl.save(product);

    }
    public List<Product> getAllData(){
        return  productRepoImpl.findAll();

    }

}
