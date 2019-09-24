package com.learning.scala.section05.object_oriented_programming_with_scala

/**
 * Created by sofia on 2019-09-23.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object AbstractClassesAndTraits extends App {

    // differences between abstract classes and traits

    // 1. abstract classes can have constructor parameters; traits cannot

    // 2. a class can extend only one class but can extend multiple traits

}

abstract class AbstractAnimal(numLegs: Int) {

    val x: Int

    def canFly: Boolean

    def eat(): Unit = {
        println("I am eating")
    }

}

class Tiger(numLegs: Int) extends AbstractAnimal(numLegs) {

    override val x: Int = 10

    override def canFly: Boolean = false

}

trait AnimalTrait {

    val x: Int

    def canFly: Boolean

    def eat(): Unit = {
        println("I am eating")
    }

}

trait Tail {

    def wagTail: Unit = {
        println("I am wagging tail")
    }
}

abstract class Pet(numLegs: Int) {

    def run(): Unit = {
        println("I am running")
    }
}

class Dog extends Pet(4) with AnimalTrait with Tail {

    override val x: Int = 20

    override def canFly: Boolean = true

}
