package com.example.oop

fun main(args: Array<String>) {
    val myPug: Dog = Pug("pug")
    val yourDog: Dog = BassetHound("Basset Hound")
    val hisDog: Dog = Chihuahua("Chihuahua")

    myPug.play()
    myPug.bark()
    myPug.run()

    yourDog.run()
    yourDog.bark()
    yourDog.play()

    hisDog.play()
    hisDog.run()
    hisDog.bark()
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
        println("A $name cannot run")
    }

    override fun bark() {
        println("A $name can bark")
    }

    override fun play() {
        println("A $name can play")
    }
}

class Chihuahua(val name: String): Dog(name) {
    override fun run() {
        println("A $name can run")
    }

    override fun bark() {
        println("A $name can bark")
    }

    override fun play() {
        println(" A $name cannot play")
    }
}