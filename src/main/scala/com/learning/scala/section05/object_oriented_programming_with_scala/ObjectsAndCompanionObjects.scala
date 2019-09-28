package com.learning.scala.section05.object_oriented_programming_with_scala

/**
 * Created by sofia on 2019-09-22.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object ObjectsAndCompanionObjects extends App {

    val user1 = new User("John", 10)
    val user2 = new User("Tom", 20)
    val user3 = new User("David", 30)

    println(user1 == user2)
    println(user2 == user3)

    val user4 = User
    val user5 = User

    println(user4 == user5)

    val user6 = User.apply("Adam")
    val user7 = User("Bob", 30)

    println(user6 == user7)

}

class User(val name: String, val age: Int)

// Scala objects are singleton instances
// objects cannot have constructor parameters
// if class name and object name are the same, then we call them companion objects
// companion objects are used, e.g., to provide factory methods
object User {

    val age = 10

    def sayHello(name: String) = {
        println(s"Hello $name")
    }

    def apply(name: String) = new User(name, age)

    def apply(name: String, age: Int) = new User(name, age)

}
