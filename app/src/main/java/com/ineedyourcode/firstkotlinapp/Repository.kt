package com.ineedyourcode.firstkotlinapp

object Repository {
    private val listOfCats: ArrayList<Cat> = ArrayList()

    init {
        for (i in 1..10) {
            listOfCats.add(Cat("Cat_$i", 11 - i))
        }
    }

    fun getListOfCats(): ArrayList<Cat> {
        return listOfCats
    }
}