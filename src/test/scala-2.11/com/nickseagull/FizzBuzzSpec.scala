package com.nickseagull

import org.scalatest.FlatSpec
import org.scalatest.matchers.MustMatchers
import com.nickseagull.FizzBuzz._

class FizzBuzzSpec extends FlatSpec with MustMatchers {

  "The FizzBuzz function" must "leave the number 1 as it is" in {
    val length = 1
    fizzBuzz(length) must equal("1\n")
  }

  it must "change the divisible by 2 numbers by Fizz" in {
    val length = 2
    fizzBuzz(length) must equal("1\nFizz\n")
  }

  it must "change the divisible by 3 numbers by Buzz" in {
    val length = 3
    fizzBuzz(length) must equal("1\nFizz\nBuzz\n")
  }

  it must "change the numbers by FizzBuzz if they meet the 2 conditions" in {
    val length = 6
    fizzBuzz(length) must equal("1\nFizz\nBuzz\nFizz\n5\nFizzBuzz\n")
  }

}
