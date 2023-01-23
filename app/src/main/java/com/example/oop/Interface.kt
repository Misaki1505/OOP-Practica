package com.example.oop

fun main(args: Array<String>) {
    val myOven: Oven? = null
    myOven?.turnOn()
    myOven?.turnOff()
    myOven?.cook(150)
}

interface Oven {
    val temperature: Int

    fun turnOn()
    fun turnOff()
    fun cook(temp: Int) {
        println("Cooking at $temp degrees")
    }
}