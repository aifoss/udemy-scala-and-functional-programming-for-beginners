package com.learning.scala.section03.elements_of_functional_programming

import scala.annotation.tailrec

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object RecursionAndTailRecursion extends App {

    def factorial(n: Int): BigInt = {
        if (n <= 1) {
            1
        } else {
            n * factorial(n-1)
        }
    }

    println(factorial(10))

    @tailrec
    def factorialTailR(n: Int, result: BigInt): BigInt = {
        if (n <= 1) {
            result
        } else {
            factorialTailR(n-1, n*result)
        }
    }

    println(factorialTailR(10, result = 1))

}
