package com.learning.scala.section05.object_oriented_programming_with_scala

import scala.collection.mutable.ListBuffer

/**
 * Created by sofia on 2019-09-22.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object BasicShoppingCartExample extends App {

    class Item(val productId: Int, val unitPrice: Double) {

        def canEqual(other: Any): Boolean = other.isInstanceOf[Item]

        override def equals(other: Any): Boolean = other match {
            case that: Item =>
                (that canEqual this) &&
                    productId == that.productId &&
                    unitPrice == that.unitPrice
            case _ => false
        }

        override def hashCode(): Int = {
            val state = Seq(productId, unitPrice)
            state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
        }

    }

    class ShoppingCart {

        private val items = ListBuffer.empty[Item]

        def add(item: Item) = {
            items.addOne(item)
        }

        def remove(item: Item) = {
            items -= item
        }

        def getNumItems(): Int = {
            items.length
        }

        def getTotal(): Double = {
            items.foldLeft(0.0)((accSum, item) => accSum + item.unitPrice)
        }

        def isEmpty(): Boolean = items.length == 0

    }

    val cart = new ShoppingCart()

    val item1 = new Item(1, 10.0)
    val item2 = new Item(2, 20.0)
    val item3 = new Item(3, 30.0)
    val item4 = new Item(4, 40.0)

    cart.add(item1)
    cart.add(item2)
    cart.add(item3)
    cart.add(item4)

    println(s"Number of items in cart: ${cart.getNumItems()}")
    println(s"Total: ${cart.getTotal()}")

    cart.remove(item1)

    println(s"Number of items in cart: ${cart.getNumItems()}")
    println(s"Total: ${cart.getTotal()}")

    cart.remove(item2)

    println(s"Number of items in cart: ${cart.getNumItems()}")
    println(s"Total: ${cart.getTotal()}")

    cart.remove(item3)

    println(s"Number of items in cart: ${cart.getNumItems()}")
    println(s"Total: ${cart.getTotal()}")

    cart.remove(item4)

    println(s"Number of items in cart: ${cart.getNumItems()}")
    println(s"Total: ${cart.getTotal()}")

    println(s"Is cart empty? ${cart.isEmpty()}")

}


