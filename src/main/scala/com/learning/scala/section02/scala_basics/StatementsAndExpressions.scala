package com.learning.scala.section02.scala_basics

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object StatementsAndExpressions extends App {

    val x = println("test")
    x
    println(s"value of x: $x")

    val y = 2 + 3
    val y2 = {val y = 2 + 3}
    println(y)
    println(s"value of y2: $y2")

    val age = 10

    val result = if (age >= 18) {
        "you are an adult"
    } else {
        "you are not an adult"
    }

    println(s"result is $result")

    val someNumber = 100

    val result2 = if (someNumber % 2 == 0 && someNumber % 3 == 0) {
        "number is divisible by both 2 and 3"
    } else if (someNumber % 2 == 0) {
        "number is divisible by 2"
    } else if (someNumber % 3 == 0) {
        "number is divisible by 3"
    } else {
        "number is not divisible by 2 or 3"
    }

    println(s"result2 is $result2")

    val flag = true

    println(if(flag) 5 else 3)

}
