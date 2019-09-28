package com.learning.scala.section03.elements_of_functional_programming

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object PureFunctions extends App {

    // pure function is a function
    // that has no side effects
    // and, given the same inputs, always returns the same output

    // pure functions offer referential transparency
    // which means that function calls can be replaced by the result values

    /* Non-Pure Functions */

    var temp = 1

    def fcn1(x: Int): Int = {
        temp = temp + x
        x + 1
    }

    def fcn2(x: Int, y: Int): Int = {
        println(s"values of (x, y) are ($x, $y)")
        x + y
    }

    def getTime(): Long = System.nanoTime()

    def fcn3(x : Int): Int = {
        getTime()
        x * x
    }

    /* Pure Functions */

    def fcn4(x: Int, y: Int) = x + y

    def fcn5(x: Int, y: Int) = Math.max(x, y)

    val result = fcn4(2, 3)

}
