package com.example.oop

fun main(args: Array<String>) {
    val translator = Translator()
    translator.sayHello()
    translator.sayHello("ch")
    translator.sayHello("es")
    translator.sayHello("di")
}

class Translator {
    fun sayHello() {
        println("English: Hello!")
    }

    fun sayHello(language: String) {
        when(language) {
            "fr" -> println("French: Bonjour")
            "ch" -> println("Chinese: Ni hao!")
            "es" -> println("Español: Hola!")
            else -> println("English: Hello!")
        }
    }
}