package PatternMatching

import scala.util.Random

object Syntax {
  def main(args: Array[String]): Unit = {
    val x: Int = Random.nextInt(10)

    x match {
      case 0 => println("zero")
      case 1 => println("one")
      case 2 => println("two")
      case 3 => println("three")
      case _ => println("many")
    }
  }
}
