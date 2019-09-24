package com.learning.scala.section05.object_oriented_programming_with_scala

/**
 * Created by sofia on 2019-09-22.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object ClassesWithPrimaryConstructors extends App {

    val person = new Person("John", "Smith")

    println(person)
    println(person.getName())
    println(person.firstName)
    println(person.lastName)
    println()

    val person2 = new Person2("Tom")

    println(person2)
    println(person2.getName())
    println(person2.firstName)
    println(person2.lastName)
    println()

}

class Person(val firstName: String, val lastName: String) {

    println("constructor begin")

    val age = 10

    def getName() = firstName+" "+lastName

    override def toString: String = s"I am $firstName, my age is $age"

    println("constructor end")

}

class Person2(val firstName: String, val lastName: String = "Smith") {

    def getName() = firstName+" "+lastName

    override def toString: String = s"I am $firstName of $lastName family"

}
