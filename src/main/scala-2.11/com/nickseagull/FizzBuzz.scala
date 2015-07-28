package com.nickseagull

/**
 * Created by Nikita on 28/07/2015.
 */
object FizzBuzz {

  def numberToFizzBuzz(number: Int): String = number match {
    case a if number % 2 == 0 => "Fizz"
    case _                    => number toString
  }

  def fizzBuzz(n: Int): String = (1 to n map numberToFizzBuzz mkString "\n") + "\n"

}
