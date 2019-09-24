package com.learning.scala.section05.object_oriented_programming_with_scala

/**
 * Created by sofia on 2019-09-23.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object CaseClasses extends App {

    // case classes are useful for immutable data modeling

    // 1. by default, case class constructor params are vals

    // 2. we don't need to provide "new" when creating an instance of a case class,
    //    because Scala creates a companion object with apply factory method

    // 3. meaningful default toString(), equals(), hashCode() implementations

    // 4. copy() creates a new case class instance

    // 5. heavily used in pattern matching

    // 6. serializable

    val emp1 = new Emp("John", 40)
    val emp2 = new Emp("John", 40)

    println(emp1)
    println(emp2)
    println(emp1 == emp2)
    println(emp1.hashCode())
    println(emp2.hashCode())

    val emp3 = Emp2("Tom", 50)
    val emp4 = Emp2("Tom", 50)
    val emp5 = emp3.copy("David")
    val emp6 = emp4.copy(name = "Steve", age = 10)

    println(emp3)
    println(emp4)
    println(emp3.name)
    println(emp4.age)
    println(emp3 == emp4)
    println(emp3.hashCode())
    println(emp4.hashCode())
    println(emp5)
    println(emp6)

}

class Emp(name: String, age: Int)

case class Emp2(name: String, age: Int)

//object Emp2 {
//
//    def apply(name: String, age: Int): Emp2 = new Emp2(name, age);
//
//}
