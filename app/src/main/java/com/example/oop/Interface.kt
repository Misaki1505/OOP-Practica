package com.example.oop

fun main(args: Array<String>) {
    val myOven: Oven? = null
}

interface Oven {
    val temperature: Int

    fun turnOn()
    fun turnOff()
    fun cook(temp: Int) {
        println("Cooking at $temp degrees")
    }
}