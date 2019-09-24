package com.learning.scala.section02.scala_basics

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object CodeBlocks extends App {

    val result = {
        val x = 10
        val y = 10*x + 1

        y
    }

    println(result.getClass)
    println(result)
    println()

    val result2 = {
        val age = 10

        if (age > 18) "Adult" else "Minor"
    }

    println(result2.getClass)
    println(result2)
    println()

    val x = 10

    val result3 = {
        val z = 10*x
        z
    }

    println(result3.getClass)
    println(result3)
    println()

    val result4 = {
        2*result
    }

    println(result4.getClass)
    println(result4)
    println()

    val result5 = {
        val x = 1
        "Hello world!"
    }

    println(result5.getClass)
    println(result5)
    println()

    val result6 = {
        val x = 1
        println("Hello world!")
    }

    println(result6.getClass)
    println(result6)
    println()

    val result7 = {
        val x = 1
        val y = x + 1
    }

    println(result7.getClass)
    println(result7)
    println()

}
