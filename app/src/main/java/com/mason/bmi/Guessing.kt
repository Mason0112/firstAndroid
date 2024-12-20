package com.mason.bmi

class Guessing {
}

fun main() {
    val secret = 7
    var num = 0

    while (num != secret) {
        println("Please enter a number(1-10)")
        val input = readLine()
        num = input?.toIntOrNull() ?: 0
        println("You enter $num")
        if (num < secret) {
            println("Bigger")
        } else if (num > secret) {
            println("smaller")
        } else {
            println("you got it")

        }
    }

}