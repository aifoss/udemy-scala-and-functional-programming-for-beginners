package com.learning.scala.section05.object_oriented_programming_with_scala

/**
 * Created by sofia on 2019-09-22.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object ClassesWithAuxiliaryConstructors extends App {

    val person1 = new Person3("John", "Smith")
    val person2 = new Person3("John")
    val person3 = new Person3()

    println(person1)
    println(person2)
    println(person3)

}

class Person3(val firstName: String, val lastName: String) {

    def this(firstName: String) {
        this(firstName, "Smith")
    }

    def this() {
        this("John", "Smith")
    }

    def getName(): String = firstName+" "+lastName

    override def toString: String = s"My name is ${getName()}"

}
