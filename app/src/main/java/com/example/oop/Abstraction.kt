package com.example.oop

fun main(args: Array<String>) {

}

abstract class Dog(name: String) {
    abstract fun run ()
    abstract fun bark ()
    abstract fun play ()
}

class Pug(val name: String): Dog(name) {
    override fun run() {
        println("A $name can run")
    }

    override fun bark() {
        println("A $name cannot bark")
    }

    override fun play() {
        println("A $name can play")
    }
}

class BassetHound(val name: String): Dog(name) {
    override fun run() {
        TODO("Not yet implemented")
    }

    override fun bark() {
        TODO("Not yet implemented")
    }

    override fun play() {
        TODO("Not yet implemented")
    }
}