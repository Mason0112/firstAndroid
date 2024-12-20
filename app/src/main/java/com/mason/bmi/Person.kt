package com.mason.bmi

class Person (val name:String, val weight:Double , val height:Double){





    fun greeting(){

        println("Hello")
    }
    fun bmi() :Double = weight / (height * height)


}

