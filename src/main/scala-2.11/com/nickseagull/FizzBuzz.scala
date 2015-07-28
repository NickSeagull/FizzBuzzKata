package com.nickseagull

/**
 * Created by Nikita on 28/07/2015.
 */
object FizzBuzz {

  def fizzBuzz(n: Int): String = (1 to n map numberToFizzBuzz mkString "\n") + "\n"

  def numberToFizzBuzz(number: Int): String = number match {
    case _ if divisibleByTwo(number) => "Fizz"
    case _                           => number toString
  }

  def divisibleByTwo(number: Int): Boolean = {
    number % 2 == 0
  }

}
