package com.example.demo

import com.example.classes.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.example.repository.CustomerRepository

@RestController
class CustomerController{
    @Autowired
    lateinit var customerRepository: CustomerRepository

    @RequestMapping("/save")
    fun process(): String{
        customerRepository.save(Customer(1, "Jack", "Smith"))
        customerRepository.save(Customer(2, "Adam", "Johnson"))
        customerRepository.save(Customer(3, "Kim", "Smith"))
        return "Done"
    }

    @RequestMapping("/findall")
    fun findAll(): List<Customer>{
        return customerRepository.findAll().toMutableList()
    }
}