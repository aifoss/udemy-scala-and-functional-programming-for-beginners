package com.learning.scala.section10.introduction_to_futures

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

/**
 * Created by sofia on 2019-09-28.
 */

/**
 * Source:
 * Udemy Course: Scala and Functional Programming for Beginners
 */
object FuturesExample extends App {

    case class Friend(name: String)
    case class Tweet(message: String)

    def getFriends(): Future[List[Friend]] = Future {
        println("start retrieving all friends")
        Thread.sleep(1000)
        println("finished retrieving all friends")
        List(Friend("John"))
    }

    def getTweets(): Future[List[Tweet]] = Future {
        println("start retrieving all tweets")
        Thread.sleep(1000)
        println("finished retrieving all tweets")
        List(Tweet("I am learning Scala"))
    }

    println("started")

    val friendsFuture: Future[List[Friend]] = getFriends()
    val tweetsFuture: Future[List[Tweet]] = getTweets()

    friendsFuture.onComplete {
        case Success(value) => println(s"friends future completed with value $value")
        case Failure(exception) => println(s"friends future failed with exception $exception")
    }

    tweetsFuture.onComplete {
        case Success(value) => println(s"tweets future completed with value $value")
        case Failure(exception) => println(s"tweets future failed with exception $exception")
    }

    friendsFuture.map {
        friendsList => println(s"friends list is $friendsList")
    }

    tweetsFuture.map {
        tweetsList => println(s"tweets list is $tweetsList")
    }

    println("finished")

    Thread.sleep(5000)

}
