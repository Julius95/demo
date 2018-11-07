package com.example.repository

import com.example.classes.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: CrudRepository<Customer, Long>{
    fun findByLastName(lastName: String): List<Customer>
}