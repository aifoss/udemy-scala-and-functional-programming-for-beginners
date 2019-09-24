package com.learning.scala.section03.elements_of_functional_programming

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object FunctionsWithVarArgs extends App {

    def concat(str1: String, str2: String): String = {
        str1+", "+str2
    }

    println(concat("hello", "world"))

    def concat2(strs: String*): String = {
        strs.mkString(", ")
    }

    println(concat2("hello"))
    println(concat2("hello", "john"))
    println(concat2("hello", "john", "how are you"))
    println(concat2(Seq("hello", "tom", "good morning"): _*))
    println(concat2(List("hello", "tom", "good morning"): _*))
    println(concat2(Array("hello", "tom", "good morning"): _*))

    def concat3(size: Int, strs: String*): String = {
        strs.mkString(", ")
    }

    println(concat3(10, "hello", "world"))

    def printAll(strings: String*): Unit = {
        strings.foreach(println)
    }

    printAll()
    printAll("a")
    printAll("a", "b")
    printAll("a", "b", "c")

    val fruits = List("apple", "banana", "cherry")

    printAll(fruits: _*)

}
