package com.learning.scala.section05.object_oriented_programming_with_scala

/**
 * Created by sofia on 2019-09-23.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object Generics extends App {

    val arr = Array[Int](1, 2, 3, 4, 5)

    val myList: List[String] = List[String]("John", "Tom", "David")


    class Doctor[T] {

        def checkHealth(patient: T): Unit = {
            println(s"health of $patient is good")
        }

        def doSomething[X, Y](a: X): Unit = {

        }
    }

    trait HumanPatient

    trait AnimalPatient

    case class John() extends HumanPatient

    case class Sheep() extends AnimalPatient

    val doctor = new Doctor[HumanPatient]

    val vet = new Doctor[AnimalPatient]

    doctor.checkHealth(John())

    vet.checkHealth(Sheep())


    val myMap = Map[String, String]("US" -> "UnitedStates", "UK" -> "United Kingdom")


    // variance types
    // 1. invariant  A
    // 2. covariant  +A
    // 3. contravariant  -A

    // invariant

    class InvariantList[A] {

    }

    def doSomethingInv(list : InvariantList[AnimalPatient]) = {
        println("I am doing something")
    }

    doSomethingInv(new InvariantList[AnimalPatient])

    // covariant

    class CovariantList[+A] {

    }

    def doSomethingCov(list: CovariantList[AnimalPatient]) = {
        println("I am doing something")
    }

    doSomethingCov(new CovariantList[Sheep])

    // contravariant

    class ContravariantList[-A] {

    }

    def doSomethingContrav(list: ContravariantList[John]) = {
        println("I am doing something")
    }

    doSomethingContrav(new ContravariantList[HumanPatient])

}
