package com.example.classes


class Car{

    private var fuel:Int
    private var driver: Person
    constructor (fuel:Int, driver: Person){
        this.fuel = fuel
        this.driver = driver
    }

    fun addFuel(fuel:Int){
        this.fuel = this.fuel+fuel
    }

    fun drive(){
        println("Driver " + driver.name + " is driving")
    }


}