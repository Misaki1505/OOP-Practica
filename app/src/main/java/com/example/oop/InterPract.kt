package com.example.oop

fun main(args: Array<String>) {
    val rest1: Restaurant = LocalRestaurante()
    rest1.provideFood()
    rest1.provideBill()

    val rest2: Restaurant = FancyRestaurant()
    rest2.provideFood()
    rest2.provideBill()
}

interface Restaurant{
    fun provideFood()
    fun provideBill()
}

class LocalRestaurante: Restaurant{
    override fun provideFood() {
        println("Your restaurant provides food and drinks")
    }

    override fun provideBill() {
        println("Please pay 25")
    }

}

class FancyRestaurant: Restaurant {
    override fun provideFood() {
        println("The most delicious food I have ever tried")
    }

    override fun provideBill() {
        println("Please pay 100")
    }

}