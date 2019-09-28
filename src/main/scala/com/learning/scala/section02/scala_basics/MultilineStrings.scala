package com.learning.scala.section02.scala_basics

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object MultilineStrings extends App {

    val aString = "dfdadfa"
    println(aString)
    println()

    val multilineString =
        """This is an example
          |of a multiline
          |string""".stripMargin
    println(multilineString)
    println()

    val anotherMultilineString =
        """This is another example
          #of a multiline
          #string""".stripMargin('#')
    println(anotherMultilineString)
    println()

    val name = "John"
    val age = 30

    val mlString =
        s"""Hello, my name is $name,
          |and my age is $age
          |""".stripMargin
    println(mlString)
    println()

    val slString = mlString.replaceAll("\n", " ")
    println(slString)
    println()

    val employeeJson =
        s"""{
          |  "employee": {
          |    "name" : $name,
          |    "age" : $age,
          |    "country" : "UK"
          |  }
          |}""".stripMargin
    println(employeeJson)

}
