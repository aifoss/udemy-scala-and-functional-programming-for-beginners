package com.learning.scala.section03.elements_of_functional_programming

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object ForComprehension extends App {

    val ints = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(ints.map(x => x*2))

    val newInts = for {
        x <- ints
    } yield x*2

    println(newInts)

    val chars = List('a', 'b', 'c')

    println(chars.map(x => x.toUpper))

    val newChars = for {
        x <- chars
    } yield x.toUpper

    println(newChars)

    case class User(name: String, age: Int)

    val u1 = User("John", 30)
    val u2 = User("Tom", 40)
    val u3 = User("David", 50)

    val users = List(u1, u2, u3)

    println(users.map(u => u.name))

    val newUsers = for {
        x <- users
    } yield x.name

    println(newUsers)

    println(users.filter(_.age >= 40).map(_.name))

    val filteredUsers = for {
        x <- users if x.age >= 40
    } yield x.name

    println(filteredUsers)

    val numbers = List(1, 2, 3)
    val colors = List("blue", "white", "red")

    println(numbers.filter(_ % 2 == 0).flatMap(n => chars.flatMap(ch => colors.map(c => (n, ch, c)))))

    val combs = for {
        n <- numbers if n % 2 == 0
        ch <- chars
        c <- colors
    } yield (n, ch, c)

    println(combs)

}
