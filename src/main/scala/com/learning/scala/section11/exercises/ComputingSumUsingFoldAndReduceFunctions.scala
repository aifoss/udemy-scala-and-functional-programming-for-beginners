package com.learning.scala.section11.exercises

/**
 * Created by sofia on 2019-09-28.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object ComputingSumUsingFoldAndReduceFunctions extends App {

    val list = List(1, 2, 3, 4, 5)


    // imperative style - do not do this in Scala

    var sum = 0

    for (e <- list) {
        sum = sum + e
    }

    println(s"imperative sum is $sum")
    println()


    // functional style

    def add(x: Int, y: Int) = {
        val accSum = x + y
        println(s"got $x and $y, sum is $accSum")
        accSum
    }

    val sum2 = list.foldLeft(0)(add)
    val sum3 = list.foldRight(0)(add)

    println(s"foldLeft sum is $sum2")
    println(s"foldRight sum is $sum3")

    val sum4 = list.fold(0)(add)

    println(s"fold sum is $sum4")
    println()


    val strings = List("John", "abc", "x", "")

    val lenSum = strings.map(x => x.length).foldLeft(0)(add)

    println(s"lenSum is $lenSum")

    def addLen(x: Int, y: String) = x + y.length

    val lenSum2 = strings.foldLeft(0)(addLen)

    println(s"lenSum2 is $lenSum2")
    println()


    def concatenate(x: String, y: String) = x + "," + y

    val concat = strings.fold("")(concatenate)

    println(concat)
    println()


    val reducedSum = list.reduce(add)
    val reducedSumLeft = list.reduceLeft(add)
    val reducedSumRight = list.reduceRight(add)

    println(s"reducedSum is $reducedSum")
    println(s"reducedSumLeft is $reducedSumLeft")
    println(s"reducedSumRight is $reducedSumRight")
    println()


    val emptyList = List.empty[Int]

    val emptySumFold = emptyList.fold(0)(add)

    // reduce cannot be used on empty list
//    val emptySumReduce = emptyList.reduce(add)

    println(s"emptySumFold is $emptySumFold")
//    println(s"emptySumReduce is $emptySumReduce")
    println()

}
