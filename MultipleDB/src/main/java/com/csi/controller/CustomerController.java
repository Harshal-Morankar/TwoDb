package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @PostMapping("/savedata")
    public Customer saveData(@RequestBody Customer customer){
        return customerServiceImpl.saveData(customer);
    }


    @GetMapping("/getalldata")
    public List<Customer> getAllData(){
        return customerServiceImpl.getAllData();
    }
}
