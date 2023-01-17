package com.example.oop

fun main(args: Array<String>) {

}

open class Airplane {
    val type = "Airbus"

    fun fly () {
        println("Flying")
    }
}

class MyAirplane: Airplane() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyPlane {
    fun start() {
        val airplane = Airplane()
        println(airplane.type)
        airplane.fly()
    }
}