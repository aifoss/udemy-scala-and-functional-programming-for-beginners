package com.learning.scala.section03.elements_of_functional_programming

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object CallByValueVsCallByName extends App {

    def getTime(): Long = {
        println("inside getTime")
        System.nanoTime()
    }

    def callByValue(x: Long): Unit = {
        println("inside callByValue")
        println(s"value of x is $x")
        println(s"value of x if $x")
    }

    def callByName(x: => Long): Unit = {
        println("inside callByName")
        println(s"value of x is $x")
        println(s"value of x if $x")
    }

    println("Calling callByValue()")
    callByValue(getTime())
    println("Done calling callByValue()")
    println()

    println("Calling callByName()")
    callByName(getTime())
    println("Done calling callByName()")
    println()

    def add(a: Long, b: => Long): Long = {
        a + b
    }

    val result = add(100, {
        println("b is call-by-name")
        10
    })

    println(result)
    println()

    def add2(a: Long, b: => Long): Long = {
        a
    }

    val result2 = add2(100, {
        println("b is call-by-name")
        10
    })

    println(result2)
    println()

    var isInfoEnabled = true

    def logInfo(x: String): Unit = {
        if (isInfoEnabled) {
            println(s"logging $x at INFO level")
        }
    }

    val name = "John"
    val age = 30

    println("call-by-value:\n")

    logInfo(s"'user is $name and age is $age'")
    println()

    isInfoEnabled = false

    logInfo(s"'user is $name and age is $age'")
    println()

    println("call-by-name:\n")

    isInfoEnabled = true

    def logInfo2(x: => String): Unit = {
        if (isInfoEnabled) {
            println(s"logging $x at INFO level")
        }
    }

    logInfo(s"'user is $name and age is $age'")
    println()

    isInfoEnabled = false

    logInfo(s"'user is $name and age is $age'")
    println()

}
