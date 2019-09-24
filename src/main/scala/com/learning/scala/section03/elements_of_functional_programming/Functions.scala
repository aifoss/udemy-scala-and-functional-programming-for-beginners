package com.learning.scala.section03.elements_of_functional_programming

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object Functions extends App {

    def sayHello() : String = {
        "Hello!"
    }

    println(sayHello())

    def welcomeText(name: String, age: Int): String = {
        s"Hello $name! Your age is $age"
    }

    println(welcomeText("John", 30))
    println(welcomeText("David", 40))

    def add(x: Int, y: Int, z: Double): Double = {
        x + y + z
    }

    println(add(1, 2, 3))

    def calculateBonus(salary: Double, exp: Int): Double = {
        if (exp <= 5) {
            salary / 10
        } else if (exp <= 10) {
            salary / 5
        } else {
            salary / 2
        }
    }

    println(calculateBonus(100000.0, 7))

}
