package com.learning.scala.section07.handling_errors_without_exceptions

/**
 * Created by sofia on 2019-09-26.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object EitherExample extends App {

    val myEither1: Either[String, Int] = Left("some string")
    val myEither2: Either[String, Int] = Right(10)

    println(myEither1)
    println(myEither2)

    def div(x: Int, y: Int): Either[String, Int] = {
        if (y == 0) {
            Left("we can't divide by 0")
        } else {
            Right(x/y)
        }
    }

    println(div(100, 3))
    println(div(100, 0))

    val result = div(100, 3)

    result match {
        case Left(m) => println(m)
        case Right(r) => println(r)
    }

}

