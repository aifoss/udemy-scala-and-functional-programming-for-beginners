package com.learning.scala.section03.elements_of_functional_programming

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object Currying extends App {

    // currying is a means of transforming a function that takes more than one argument
    // into a chain of calls to functions, each of which takes a single argument

    def add(x: Int, y: Int) = x + y

    println(add(2, 3))

    def add2(x: Int)(y: Int) = x + y

    val temp = add2(2) _
    val result = temp(3)

    println(result)

    def add3(x: Int)(y: Int)(z: Int) = x + y + z

    def addX = add3(1) _
    def addY = addX(2)
    val addZ = addY(3)

    println(addZ)

    def add4(x: Int, y: Int, z: Int) = x + y + z

    val curriedAdd = (add4 _).curried

    println(curriedAdd(1)(2)(3))

    val curriedAddX = curriedAdd(1)
    val curriedAddY = curriedAddX(2)
    val curriedAddZ = curriedAddY(3)

    println(curriedAddZ)

    def computeTotal(vat: Double, serviceCharge: Double, productPrice: Double): Double = {
        productPrice + productPrice * serviceCharge / 100 + productPrice * vat / 100
    }

    println(computeTotal(20, 10, 120))

    def computeTotalCurried(vat: Double)
                            (serviceCharge: Double)
                            (productPrice: Double): Double = {

        productPrice + productPrice * serviceCharge / 100 + productPrice * vat / 100
    }

    val vatApplied = computeTotalCurried(20) _
    val serviceChargeApplied = vatApplied(10)
    val finalProductPrice = serviceChargeApplied(120)

    println(finalProductPrice)

    val curriedComputeTotal = (computeTotal _).curried

    val vatApplied2 = curriedComputeTotal(20)
    val serviceChargeApplied2 = vatApplied2(10)
    val finalProductPrice2 = serviceChargeApplied2(120)

    println(finalProductPrice2)

}
