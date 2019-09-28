package com.learning.scala.section11.exercises

import scala.io.Source
import scala.util.{Failure, Success, Try}

/**
 * Created by sofia on 2019-09-28.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object ReadingDataFromCSVFile extends App {

    case class Student(name: String, age: Int)

    val data: List[Student] =

        Try {
            Source.fromResource("students.csv")
                .getLines()
                .toList
                .drop(1)
                .map { line =>
                    val arr = line.split(",")
                    val name = arr(0).trim
                    val age = arr(1).trim.toInt

                    val student = Student(name, age)

                    student
                }
        } match {
            case Success(value) => value
            case Failure(exception) => {
                println(s"error during parsing csv, exception is $exception")
                List.empty[Student]
            }
        }

    println(data)

}
