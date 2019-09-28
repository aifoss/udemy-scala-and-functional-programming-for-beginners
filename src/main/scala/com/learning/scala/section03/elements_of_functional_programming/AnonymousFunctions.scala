package com.learning.scala.section03.elements_of_functional_programming

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object AnonymousFunctions extends App {

    def inc2(x: Int): Int = {
        x + 2
    }

    val inc2Literal: Int => Int = (x: Int) => x + 2

    println(inc2(10))
    println(inc2Literal(10))
    println()

    def mult(x: Int, y: Int) = x * y

    val multLiteral: (Int, Int) => Int = (x: Int, y: Int) => x * y

    println(mult(5, 10))
    println(multLiteral(5, 10))
    println()

    def dir() = {
        System.getProperty("user.dir")
    }

    val dirLiteral = () => System.getProperty("user.dir")

    println(dir())
    println(dirLiteral())
    println()

    val aList = List.range(1, 101)

    println(aList)

    val isEven = (x:Int) => x % 2 == 0

    println(aList.filter(isEven))
    println(aList.filterNot(isEven))

    val evens = aList.filter((x: Int) => x % 2 == 0)
    val odds = aList.filterNot((x: Int) => x % 2 == 0)

    println(odds)
    println(evens)

    val doubles = aList.map((x: Int) => 2*x)

    println(doubles)

    val evens2 = aList.filter(_ % 2 == 0)

    println(evens2)
    println()

    val strings = List("John", "Tom", "Steve", "David")

    println(strings.filter((x: String) => x.length() == 5))
    println()

    strings.foreach((x: String) => println(x))
    println()

    strings.foreach(println(_))
    println()

}
