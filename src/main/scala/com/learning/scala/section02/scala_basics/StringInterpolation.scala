package com.learning.scala.section02.scala_basics

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object StringInterpolation extends App {

    // s interpolator - processes special characters or literals

    val name = "John"
    val age = 30

    println("Hello "+name+", your age is "+age)
    println(s"Hello $name, your age is $age")

    println(s"1+1 is ${1+1}")

    case class Student(name: String, age: Int)

    val student = Student("John", 30)

    println(s"Hello ${student.name}, your age is ${student.age}")
    println(s"Hello ${student.name},\nyour age is ${student.age}")

    // raw interpolator - processes literals

    println(raw"Hello ${student.name}, your age is ${student.age}")
    println(raw"Hello ${student.name},\nyour age is ${student.age}")

    // f interpolator ~ printf

    val height = 6.257575f

    println(s"Hello ${student.name},\nyour age is ${student.age},\nyour height is $height ft")
    println(f"Hello ${student.name},\nyour age is ${student.age},\nyour height is $height%.1f ft")

}
