package com.learning.scala.section04.implicits_in_scala

import scala.concurrent.duration.FiniteDuration
import scala.concurrent.duration._

/**
 * Created by sofia on 2019-09-22.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object Implicits extends App {

    // implicit declarations can be var, val, def, or class


    /* Implicit Parameters */

    def sayHello(name: String, prefix: String) = s"$prefix $name"

    println(sayHello("John", "Hi"))


    def sayHelloCurried(name: String)(prefix: String) = s"$prefix $name"

    println(sayHelloCurried("Tom")("Hi"))


    implicit val text = "Hi"

    def sayHelloImplicit(name: String)(implicit prefix: String) = s"$prefix $name"

    println(sayHelloImplicit("Steve"))
    println(sayHelloImplicit("David")("Hello"))


    implicit val timeout: FiniteDuration = 1.second

    def doLongRunningTaskA()(implicit timeout: FiniteDuration): String = {
        // some time-consuming and long-running task
        // with lots of logic inside
        "some result"
    }

    def doLongRunningTaskB()(implicit timeout: FiniteDuration): Int = {
        // some time-consuming and long-running task
        // with lots of logic inside
        1
    }

    def doLongRunningTaskC()(implicit timeout: FiniteDuration): Long = {
        // some time-consuming and long-running task
        // with lots of logic inside
        timeout.toMillis
    }

    println(doLongRunningTaskA())
    println(doLongRunningTaskB())
    println(doLongRunningTaskC())


    implicit val a = 'a'
    implicit val b = 10
    implicit val c = 20.0

    def doSomethingWithMultipleImplicits()(implicit a: Char, b: Int, c: Double) = {
        "done"
    }

    println(doSomethingWithMultipleImplicits())


    /* Implicit Conversion Using def */

    implicit def int2String(number: Int): String = number.toString

    def someRandomNumber: Int = scala.util.Random.nextInt

    val someResult = someRandomNumber

    println(someResult)


    /* Implicit Classes */

    // implicit classes are used to extend final classes

    implicit class ExtendedString(s: String) {
        def increment = s.map((c: Char) => (c+1).toChar)
    }

    val str: String = "ABC"

    val incrementedStr = str.increment

    println(incrementedStr)

}
