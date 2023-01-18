package com.example.oop

fun main(args: Array<String>) {
    val myLock = EncriptionLock(40)

    println("Does the key 34 unlock my lock: ${myLock.unLock(34)}")
    println("Does the key 70 unlock my lock: ${myLock.unLock(70)}")
}

class EncriptionLock(private val privateKey: Int) {

    public fun unLock(publicKey: Int) = formula(publicKey) == privateKey


    private fun formula(publicKey: Int) = publicKey / 2 + 5
}