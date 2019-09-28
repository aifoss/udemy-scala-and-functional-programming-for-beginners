package com.learning.scala.section05.object_oriented_programming_with_scala

/**
 * Created by sofia on 2019-09-23.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object AnonymousClasses extends App {

    class AnimalAC(val name: String) {
        def eat() = println("I am eating")
    }

    class DogAC(name: String) extends AnimalAC(name) {
        override def eat() = println("I am a dog and I am eating")
    }

    def checkHealth(animal: AnimalAC) {
        println(s"I am ${animal.name} and my health is good!")
    }

    val animal = new AnimalAC("Animal")
    val dog = new DogAC("Dog")

    checkHealth(animal)
    checkHealth(dog)

    checkHealth(new AnimalAC("AnonymousDog") {
        override def eat(): Unit = {
            println("I am a dog and I am eating")
        }
    })

    val anonymousDog = new AnimalAC("AnonymousDog") {
        override def eat(): Unit = {
            println("I am a dog and I am eating")
        }
    }

    checkHealth(anonymousDog)

    trait AnimalACTrait {
        def eat(): Unit
    }

    def checkAppetite(animal: AnimalACTrait): Unit = {
        animal.eat()
    }

    val anonymousCat = new AnimalACTrait() {
        override def eat(): Unit = {
            println("I am a cat and I am eating")
        }
    }

    checkAppetite(anonymousCat)

}
