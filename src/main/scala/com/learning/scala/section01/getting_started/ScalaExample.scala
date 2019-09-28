package com.learning.scala.section01.getting_started

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object ScalaExample extends App {

    case class Employee(name: String, age: Int)

    val emp = Employee("Tom", 35)

    println(emp)

}
