package com.learning.scala.section02.scala_basics

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object VarVsVal {

    def main(args: Array[String]): Unit = {

        // var

        var age: Int = 30
        println("age: "+age)

        age = 100
        println("age: "+age)

        // val

        val newAge: Int = 40
        println("newAge: "+newAge)
    }

}
