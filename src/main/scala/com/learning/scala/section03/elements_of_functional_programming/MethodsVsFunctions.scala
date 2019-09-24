package com.learning.scala.section03.elements_of_functional_programming

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object MethodsVsFunctions extends App {

    /* Methods */

    def inc(x: Int) = x + 1

    println(inc(10))

    /* Functions */

    // methods can't be final values but functions can be final values

    val incFcn = (x: Int) => x + 1

    println(incFcn)
    println(incFcn.isInstanceOf[Function1[Int, Int]])
    println(incFcn.isInstanceOf[Int => Int])

    // eta expansion
    // when a function is expected but a method is provided,
    // Scala will automatically convert the method to a function

    val anotherFcn = inc _

    println(anotherFcn.isInstanceOf[Function1[Int, Int]])
    println(anotherFcn.isInstanceOf[Int => Int])

    val myList = List(1, 2, 3, 4)

    println(myList.map(inc))

    println(incFcn(1))
    println(incFcn.apply(1))

    // methods can have no param list, but functions must have a param list

    def m1 = 10

    val m1Fcn = () => 10

    // method name means invocation, while function name means function itself

    println(m1)
    println(m1Fcn)
    println(m1Fcn())

    // functions can be composed using andThen

    val fcn1 = (x: Int) => x + 1
    val fcn2 = (y: Int) => y * 10

    val result = fcn1.andThen(fcn2)(1)

    println(result)

}
