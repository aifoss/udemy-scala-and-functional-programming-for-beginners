package com.learning.scala.section05.object_oriented_programming_with_scala

/**
 * Created by sofia on 2019-09-22.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object IntroToClasses extends App {

    val emp = new Employee()

    println(emp.getAge())

}

class Employee {

    private val age = 10
    private val name = "John"

    def getAge(): Int = age

    def getName(): String = name

    class SomeOtherClass {

    }

    object someObject {

    }

    trait someTrait {

    }

}
