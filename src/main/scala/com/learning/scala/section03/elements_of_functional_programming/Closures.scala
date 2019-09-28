package com.learning.scala.section03.elements_of_functional_programming

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object Closures extends App {

    val myClosure = new MyClosure()

    println(myClosure.sayHello("John"))

    myClosure.age = 20

    val age = 1000

    println(myClosure.sayHello("Tom"))

}

class MyClosure {

    var age = 10

    def sayHello(name: String): String = {
        s"Hello $name, your age is $age"
    }

}
