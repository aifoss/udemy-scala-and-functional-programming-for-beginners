package com.learning.scala.section03.elements_of_functional_programming

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object DefaultAndNamedArguments extends App {

    /* Default Arguments */

    def add(x: Int, y: Int = 20): Int = {
        x + y
    }

    println(add(10, 10))
    println(add(10))

    def add2(x: Int = 10, y: Int = 20): Int = {
        x + y
    }

    println(add2())

    def add3(x: Int, y: Int, z: Int = 5) = x + y + z

    println(add3(1, 2, 3))
    println(add3(1, 3))

    /* Named Arguments */

    def namedAdd(x: Int, y: Int) = x + y

    println(namedAdd(1, 2))

    println(namedAdd(x = 1, y = 2))

    println(namedAdd(y = 2, x = 1))

    println(namedAdd(1, y = 2))

    println(namedAdd(x = 1, 2))

}
