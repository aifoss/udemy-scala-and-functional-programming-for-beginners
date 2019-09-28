package com.learning.scala.section02.scala_basics

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object StaticTypingAndTypeInference extends App {

    /* Static Typing */

    val aFlag: Boolean = true
    val anInt: Int = 10
    val aName: String = "John"

    /* Type Inference */

    val anotherFlag = true
    println("Class of anotherFlag: "+anotherFlag.getClass)

    val anotherInt = 20
    println("Class of anotherInt: "+anotherInt.getClass)

    val anotherName = "Tom"
    println("Class of anotherName: "+anotherName.getClass)

    val aLong = 10000000000L
    println("aLong: "+aLong)

    val aFloat = 10.0F
    println("aFloat: "+aFloat)

    val aDouble = 10.0
    println("aDouble: "+aDouble)

    def add(x: Int, y: Int) = {
        x+y
    }

    println("1+2="+add(1,2))

}
