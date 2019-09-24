package com.learning.scala.section05.object_oriented_programming_with_scala

/**
 * Created by sofia on 2019-09-23.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object ExceptionHandling extends App {

    case class Customer(age: Int)

    class NotAdultException(val message: String) extends RuntimeException(message)

    def buyCigarettes(customer: Customer): Unit = {
        if (customer.age < 18) {
            throw new NotAdultException("you are not allowed to buy cigarettes")
        }
    }

    try {
        buyCigarettes(Customer(17))
    } catch {
        case e: NotAdultException => println(s"NotAdultException caught: ${e.message}")
    } finally {
        println("finally block being executed")
    }

}
