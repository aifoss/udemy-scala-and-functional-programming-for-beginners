package com.learning.scala.section06.pattern_matching_in_scala

/**
 * Created by sofia on 2019-09-24.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object PatternMatching extends App {

    val x = 10

    x match {
        case 1 => println("x value is 1")
        case 2 => println("x value is 2")
        case 3 => println("x value is 3")
        case _ => println("x is something else")
    }

    x match {
        case n if n % 2 == 0 => println("x is even")
        case n if n % 2 == 1 => println("x is odd")
        case _ => println("x is neither even nor odd")
    }

    val status: Int = 404

    status match {
        case n if n >= 200 && n < 300 => println("success")
        case n if n >= 300 && n < 400 => println("redirect")
        case n if n >= 400 && n < 500 => println("bad request")
        case n if n >= 500 => println("server error")
    }


    case class Person(name: String, age: Int)

    val person = Person("John", 40)

    person match {
//        case Person(n, a) => println(s"My name is $n and age is $a")
        case Person(n, a) if a < 18 => println(s"My name is $n and I am a minor")
        case Person(n, _) if n.length > 10 => println(s"I have a long name $n")
        case _ => println("I am nobody")
    }


    val myTuple = (1, (2, 3))

    val result = myTuple match {
        case (_, (_, x)) => x
    }

    println(result)


    val list = List(1, 2, 3, 4, 5)

    val result2 = list match {
        case Nil => "empty"
        case head :: List(_*) => head
//        case anything => "not empty"
//        case a :: List(_) => a
//        case head :: tail => head
//        case List(a, b, _, _, _) => a + b
    }

    println(result2)


    try {

    } catch {
        case e: RuntimeException => "rte"
        case e: IndexOutOfBoundsException => "ioob"
        case e: NullPointerException => "npe"
        case _ => "generic"
    } finally {

    }

}
