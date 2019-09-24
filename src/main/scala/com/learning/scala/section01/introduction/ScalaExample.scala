package com.learning.scala.section01.introduction

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object ScalaExample extends App {

    case class Employee(name: String, age: Int)

    val emp = Employee("Tom", 35)

    println(emp)

}
