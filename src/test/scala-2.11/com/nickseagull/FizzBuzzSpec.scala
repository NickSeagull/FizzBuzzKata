package com.nickseagull

import org.scalatest.FlatSpec
import org.scalatest.matchers.MustMatchers
import com.nickseagull.FizzBuzz._

/*
  TODO: Return a string made up from a sequence of numbers with the following conditions:
    - If the number is divisible by 2, it will be changed by "Fizz"
    - If the number is divisible by 3, it will be changed by "Buzz"
    - If these 2 conditions are met, the number will be changed by "FizzBuzz"
    - If not, the number will stay the same
 */

class FizzBuzzSpec extends FlatSpec with MustMatchers {

  "The FizzBuzz function" must "leave the number 1 as it is" in {
    val length = 1
    fizzBuzz(length) must equal("1\n")
  }

  it must "change the divisible by 2 numbers by Fizz" in {
    val length = 2
    fizzBuzz(length) must equal("1\nFizz\n")
  }

}
