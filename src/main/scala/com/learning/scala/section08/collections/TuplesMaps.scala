package com.learning.scala.section08.collections

/**
 * Created by sofia on 2019-09-28.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object TuplesMaps extends App {

    // tuple - finite ordered list

    val tuple1 = Tuple1(1)
    val tuple2 = Tuple2(1, 2)
    val tuple3 = Tuple3(1, 2, 3)

    println(tuple1)
    println(tuple2)
    println(tuple3)

    val tuple4: Tuple2[Int, String] = Tuple2(1, "Hello")
    val tuple5: (Int, String) = Tuple2(2, "World")

    println(tuple4)
    println(tuple5)
    println(tuple4._1)
    println(tuple5._2)

    def tuple6: (Int, String, Double) = {
        (1, "A", 5.0)
    }

    println(tuple6)


    // map

    val aMap: Map[Int, String] = Map(1 -> "US", 2 -> "UK", 3 -> "GE", (4, "FR"))

    println(aMap)

    val updatedMap = aMap + (4 -> "PO")

    println(updatedMap)

    val updatedMap2 = updatedMap + (5 -> "SW")

    println(updatedMap2)

    val updatedMap3 = updatedMap2 - 1

    println(updatedMap3)

    println(aMap.contains(1))
    println(aMap.get(1))
    println(aMap.contains(10))
    println(aMap.get(10))

    val newMap: Map[Int, String] = aMap.map(x => (x._1, x._2.toLowerCase))

    println(newMap)
    println(newMap.filter(x => x._1 % 2 == 0))

}
