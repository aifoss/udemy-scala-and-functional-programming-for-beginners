package com.learning.scala.section07.handling_errors_without_exceptions

import java.net.URL

import scala.util.{Failure, Success, Try}

/**
 * Created by sofia on 2019-09-26.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object TryExample extends App {

    val result = Try {
        1/0
    }

    result match {
        case Success(value) => println(value)
        case Failure(exception) => println(exception.getMessage)
    }

    Try {
        new URL("http://www.example.com")
    } match {
        case Success(value) => println(value)
        case Failure(exception) => println(exception.getMessage)
    }

}
