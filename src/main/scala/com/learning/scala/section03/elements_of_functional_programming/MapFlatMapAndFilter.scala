package com.learning.scala.section03.elements_of_functional_programming

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object MapFlatMapAndFilter extends App {

    /* Map */

    val list = List(1, 2, 3, 4, 5)

    val f: Int => Int = (x: Int) => x*2

    val m = list.map(x => x*2)

    println(f(1))
    println(m)
    println(list.map(x => x+10))

    val strings = List("John", "Tom", "David", "Steve")

    println(strings.map(x => x.length))

    class User(val name: String, val age: Int)

    val u1 = new User("John", 30)
    val u2 = new User("Tom", 40)
    val u3 = new User("David", 50)

    val userList = List(u1, u2, u3)

    println(userList.map(u => u.name))


    /* FlatMap */

    val nestedList = List(List(1,2), List(3,4,5), List(6,7))
    val mappedList = nestedList.map(list => list.map(x => x*2))
    val flatMappedList = nestedList.flatMap(list => list.map(x => x*2))

    println(mappedList)
    println(mappedList.flatten)
    println(flatMappedList)

    val numbers = List(1, 2, 3)
    val chars = List('a', 'b', 'c')

    println(numbers.flatMap(n => chars.map(c => (n, c))))

    val colors = List("blue", "white", "red")

    println(numbers.flatMap(n => chars.flatMap(ch => colors.map(c => (n, ch, c)))))


    /* Filter */

    println(list.filter(x => x % 2 != 0))
    println(userList.filter(u => u.age >= 40).map(u => u.name))
    println(nestedList.filter(list => list.size == 3))

}
