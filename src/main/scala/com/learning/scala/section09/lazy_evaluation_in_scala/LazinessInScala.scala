package com.learning.scala.section09.lazy_evaluation_in_scala

/**
 * Created by sofia on 2019-09-28.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object LazinessInScala extends App {

    // early or eager or strict evaluation (default in Scala)

    val x = {
        println("I am inside of x code block") // gets printed even if x is not referenced
        // some costly computation
        2 + 3 * 1000 / 45
    }

    // lazy evaluation

    lazy val y = {
        println("I am inside of y code block") // doesn't get printed if y is not referenced
        // some costly computation
        2 + 3 * 1000 / 45
    }


    lazy val a = {
        println("I am inside of a code block")
        // some costly computation
        2 + 3 * 1000 / 45
    }

    lazy val b = {
        println("I am inside of b code block")
        // some costly computation
        2 + 3 * 1000 / 45
    }

    def testLazy(flag: Boolean) = {
        if (flag) {
            println(s"a value is $a")
        } else {
            println(s"b value is $b")
        }
    }

    println("testLazy with flag=true:")
    testLazy(true)

    println("testLazy with flag=false:")
    testLazy(false)


    // List vs Stream
    // List is strict but Stream is lazy

    val list = (1 to 10).toList

    println(s"list is $list")

    val stream = (1 to 10).toStream

    println(s"stream is $stream")
    stream.foreach(println(_))

}
