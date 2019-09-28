package com.learning.scala.section03.elements_of_functional_programming

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object NestedFunctions extends App {

    def avg(x: Double, y: Double, z: Double): Double = {
        def sum: Double = x + y + z
        sum / 3
    }

    println(avg(1, 2, 3))

    def maxOf3(x: Int, y: Int, z: Int): Int = {
        def maxOf2(a: Int, b: Int) = if (a >= b) a else b
        maxOf2(x, maxOf2(y, z))
    }

    println(maxOf3(1, 2, 3))

}
