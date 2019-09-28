package com.learning.scala.section07.handling_errors_without_exceptions

/**
 * Created by sofia on 2019-09-26.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object OptionExample extends App {

    // Option is a container for an optional value

    val name: String = "John"
    val maybeName: Option[String] = Option(name); // apply

    println(maybeName)

    val anotherName: String = null
    val anotherMaybeName: Option[String] = Option(anotherName)

    println(anotherMaybeName)


    // prevent NPE

    println(Option(name).map(n => n.length))
    println(Option(anotherName).map(n => n.length))


    case class User(name: String, age: Int, gender: Option[String])


    // get

    val myOption = Option(name)

    if (myOption.isDefined) {
        println(myOption.get)
    } else {
        println("No value here")
    }


    // getOrElse

    val anotherOption = Option(anotherName)

    println(anotherOption.getOrElse("some default value"))


    // map collection

    val myMap = Map("US" -> "United States", "UK" -> "United Kingdom")

    println(myMap.get("US"))
    println(myMap.get("FS"))


    // list

    val list = List(1, 2, 3, 4, 5)

    println(list.head)

    val anotherList = List.empty

    println(anotherList.headOption)


    // map, flatMap, filter

    val maybeInt: Option[Int] = Option(1)

    println(maybeInt.map(_ * 2))

    val x = maybeInt.map(x => Option(x * 10))

    println(x)

    val y = maybeInt.flatMap(x => Option(x * 10))

    println(y)

    println(maybeInt.filter(_ % 2 == 0))


    // orElse

    val firstName = Option("John")
    val lastName = Option("Smith")

    println(firstName.orElse(lastName).orElse(Option("no name")))


    // pattern matching

    firstName match {
        case Some(a) => println(s"name is $a")
        case None => println("name is missing")
    }


    // fold

    val secondName: Option[String] = Option(null)

    secondName.fold(println("name is missing"))(a => println(s"name is $a"))

}
