package com.mason.bmi

class Person {
    var name:String? = null
        set(value){
            field = value
        }
        get(){
            return field
        }
    fun greeting(){

        println("Hello by $name")
    }

}

