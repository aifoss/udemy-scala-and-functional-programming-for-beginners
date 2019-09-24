package com.learning.scala.section02.scala_basics

/**
 * Created by sofia on 2019-09-21.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming - From Beginner to Expert
 */
object DataTypes {

    def main(args: Array[String]): Unit = {

        /* Data Types */

        println("Data types in Scala:\n")

        // Boolean

        var flag: Boolean = true
        println("Boolean: "+flag)

        // Byte [-128, 127]

        var aByte: Byte = 100
        println("Byte: "+aByte)

        // Char [0, 65535]

        var aChar: Char = 1000
        println("Char: "+aChar)

        // Short [-32768, 32767]

        var aShort: Short = 32760
        println("Short: "+aShort)

        // Int [-2^31, 2^31-1]

        var anInt: Int = 1000000
        println("Int: "+anInt)

        // Long [-2^63, 2^63-1]

        var aLong: Long = 1000000000L
        println("Long: "+aLong)

        // Float

        var aFloat: Float = 10.5F
        println("Float: "+aFloat)

        // Double

        var aDouble: Double = 10.5
        println("Double: "+aDouble)

        // String

        var aString: String = "string"
        println("String: "+aString)

        // Unit

        var aUnit: Unit = ()
        println("Unit: "+aUnit)

        println()


        /* Type Casting */

        println("Type Casting in Scala:\n")

        var bByte: Byte = 100
        println("Byte: "+bByte)

        var bShort: Short = bByte
        println("Byte->Short: "+bShort)

        var bInt: Int = bShort
        println("Short->Int: "+bInt)

        var bLong: Long = bInt
        println("Int->Long: "+bLong)

        var bFloat: Float = 10.0f
        println("Float: "+bFloat)

        var bDouble: Double = bFloat
        println("Float->Double: "+bDouble)
    }

}
