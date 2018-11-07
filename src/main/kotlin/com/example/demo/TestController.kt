package com.example.demo

import com.example.classes.Person
import org.springframework.web.bind.annotation.*


@RestController
class TestController{

    val map : MutableMap<String, Person> = HashMap()

    @GetMapping("/greeting")
    fun getGreeting(): String{
        println("--HELLO--")
        return "hello world"
    }

    @GetMapping("/person")
    fun getAll() : MutableCollection<Person>{
        return map.values
    }

    @GetMapping("/person/{name}")
    fun getPerson(@PathVariable("name") name:String) : Person {
        return map.getOrDefault(name, Person("unknown", 0))
    }

    @PostMapping("/person")
    fun postPerson(@RequestBody postedPerson: Person){
        map.put(postedPerson.name, postedPerson)
    }

    @DeleteMapping("/person/{name}")
    fun deletePerson(@PathVariable("name") name:String){
        map.remove(name)
    }
}