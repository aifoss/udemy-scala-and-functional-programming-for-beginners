package com.learning.scala.section02.scala_basics

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object StringOperations extends App {

    val myStr = "Hello, my name is John"

    println("myStr.length="+myStr.length)

    println("myStr.toLowerCase="+myStr.toLowerCase)

    println("myStr.toUpperCase="+myStr.toUpperCase)

    println("myStr.reverse="+myStr.reverse)

    println("myStr.charAt(0)="+myStr.charAt(0))

    println("myStr.startsWith(\"Hel\")="+myStr.startsWith("Hel"))

    println("myStr.contains(\"hel\")="+myStr.contains("hel"))

    println("myStr.split(\" \")="+myStr.split(" ").toList)

    println("myStr.take(3)="+myStr.take(3))

    println("myStr.replace(\",\", \"!\")="+myStr.replace(",", "!"))

    println("myStr.replaceAll(\" \", \"_\")="+myStr.replaceAll(" ", "_"))

    println("myStr.substring(0, 10)="+myStr.substring(0, 10))

    println("myStr.trim="+(" "+myStr+"   ").trim)

    println("myStr.isEmpty="+myStr.isEmpty)

    println("myStr.indexOf(\"my\")="+myStr.indexOf("my"))

    println("myStr.lastIndexOf(\"name\")="+myStr.lastIndexOf("name"))

}
