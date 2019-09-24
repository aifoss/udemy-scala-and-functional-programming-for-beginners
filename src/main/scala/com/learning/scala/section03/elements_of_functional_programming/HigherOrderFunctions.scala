package com.learning.scala.section03.elements_of_functional_programming

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object HigherOrderFunctions extends App {

    val ourCharge = 10
    val providerACharge = (x: Double) => x/10
    val providerBCharge = (x: Double) => x/5

    def transferMoney(x: Double, pCharge: Double => Double): Double = {
        x - ourCharge - pCharge(x)
    }

    println(transferMoney(100, providerACharge))
    println(transferMoney(100, providerBCharge))

    def add(x: Int, y: Int) = x + y
    def addThenPrint(add: (Int, Int) => Int, a:Int, b:Int) = {
        println(add(a, b))
    }

    addThenPrint(add, 2, 3)
    addThenPrint((x: Int, y:Int) => x + y + 1000, 2, 3)

}
