package NestedMethods

object NestedMethods {
  def factorial(x: Int): Int = {
    def fact(x: Int, accumulator: Int): Int = {
      if(x <= 1) accumulator
      else fact(x - 1, x * accumulator)
    }
    fact(x, 1)
  }

  def main(args: Array[String]): Unit = {
    println(factorial(5))
    println(factorial(3))
  }
}
