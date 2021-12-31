package com.ineedyourcode.firstkotlinapp

class Cat(private val name: String, private val age: Int) {

    override fun toString(): String {
        return "Cat [Name: $name, age: $age]"
    }
}