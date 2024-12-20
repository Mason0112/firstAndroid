package com.mason.bmi

fun main() {
    val array = intArrayOf(1,3,5,7,9)
    println(array[0])

    val ss = arrayOf("Sunday","Monday","Tuesday","Wednesday")
    println(ss.get(0))
    println(ss.size)

    for (day in ss ){
        println(day)
    }


    //For
    val range = 0..10
    for (i in 0..30 ){
        if(i %2 == 0){
            print("*")
        }else{
            print(" ")
        }
    }
    println()

    for (i in 1..30 step 2)
        print("$i ")

    println()



    var name:String? = null
    println(name?.length)

    println(name ?: 0)

    var counter = 0

    counter = counter +1
    counter ++
    println(counter)
    counter = counter -1
    println(counter)

    println(10/3.0)

    //Boolean
    var a = true
    var b = false

    println(a && b)
    println(a || b)


    var num = -8

    println(num >= -10 && num <= 10)
    println(num < -10 || num > 10)


}