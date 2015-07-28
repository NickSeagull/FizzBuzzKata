package com.nickseagull

/**
 * Created by Nikita on 28/07/2015.
 */
object FizzBuzz {

  def fizzBuzz(n: Int): String = (1 to n map numberToFizzBuzz mkString "\n") + "\n"


  def numberToFizzBuzz(number: Int): String = number match {
    case _ if divisibleByTwoAndThree(number) => "FizzBuzz"
    case _ if divisibleByTwo(number)         => "Fizz"
    case _ if divisibleByThree(number)       => "Buzz"
    case _                                   => number toString
  }

  def divisibleByTwoAndThree(number: Int) = divisibleByTwo(number) && divisibleByThree(number)
  def divisibleByTwo(number: Int)   = number % 2 == 0
  def divisibleByThree(number: Int) = number % 3 == 0
}
