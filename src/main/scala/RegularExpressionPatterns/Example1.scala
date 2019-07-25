package RegularExpressionPatterns
import scala.util.matching.Regex

object Example1 {
  def main(args: Array[String]): Unit = {
    val numberPattern: Regex = "[0-9]".r

    numberPattern.findFirstMatchIn("awesomepassword") match {
      case Some(_) => println("Password OK")
      case None => println("Password must contain a number")
    }

    numberPattern.findFirstMatchIn("awesomepassword2") match {
      case Some(_) => println("Password OK")
      case None => println("Password must contain a number")
    }
  }
}
