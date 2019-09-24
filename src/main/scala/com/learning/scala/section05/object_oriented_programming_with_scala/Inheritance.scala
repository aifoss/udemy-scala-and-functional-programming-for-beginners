package com.learning.scala.section05.object_oriented_programming_with_scala

/**
 * Created by sofia on 2019-09-22.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object Inheritance extends App {

    val cat = new Cat()
    println(cat.canFly)
    println(cat.anotherFly)
    cat.eat()
    cat.move()

    val bird = new Bird()
    println(bird.x)
    println(bird.canFly)
    bird.jump()
    bird.jump(3)
    bird.move()

    val bird2: Animal = new Bird()
    println(bird2.canFly)
    bird2.move()

}

class Animal(numLegs: Int) {

    val x: Int = 10

    def canFly: Boolean = false

    protected def canFly2: Boolean = false

    final def move(): Unit = {
        println("I am moving")
    }

}

class Cat(numLegs: Int = 4, eatingStyle: String = "chew") extends Animal(numLegs) {

    def anotherFly: Boolean = {
        canFly2
    }

    def eat(): Unit = {
        println("I am eating")
    }

}

class Bird(numLegs: Int = 2, override val x: Int = 20) extends Animal(numLegs) {

//    override val x: Int = 20

    override def canFly: Boolean = true

    def jump(): Unit = {
        println("I am jumping 1 step")
    }

    def jump(steps: Int): Unit = {
        println(s"I am jumping $steps steps")
    }

}
