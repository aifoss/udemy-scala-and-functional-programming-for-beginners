package com.learning.scala.section08.collections

/**
 * Created by sofia on 2019-09-28.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object SequencesListsArrays extends App {

    // sequence

    val seq: Seq[Int] = Seq(1, 2, 3, -1, -2)

    println(seq)
    println(seq(2))
    println(seq.reverse)
    println(0 +: seq)
    println(seq :+ 4)
    println(seq ++ Seq(4, 5))
    println(seq.sorted)
    println(seq.sum)


    // range

    val range: Seq[Int] = 1 to 10

    range.foreach(println(_))

    (1 to 20).foreach(x => println(s"$x. Hello World"))


    // list
    // LinearSeq and immutable
    // head, tail, isEmpty are fast with O(1)

    val list: List[Int] = List(1, 2, 3)

    println(list)
    println(List.fill(10)("Hello"))
    println(List.fill(10)(0))
    println(list.mkString(","))
    println(List("Hello", "World").mkString("...."));


    // array

    val array = Array(1, 2, 3)

    println(array.foreach(println))

    array(1) = 100

    println(array.foreach(println))

    array.update(0, 200)

    println(array.foreach(println))

}
