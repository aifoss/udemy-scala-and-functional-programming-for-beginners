package com.learning.scala.section05.object_oriented_programming_with_scala

/**
 * Created by sofia on 2019-09-23.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object SealedKeyword extends App {

    // subclasses of a sealed class should be defined in the same source file

}

sealed class ParentClass {

}

class ChildClass extends ParentClass {

}
