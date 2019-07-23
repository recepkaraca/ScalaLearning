package Basics

trait Greeter {
  def greet(name: String): Unit
}

trait GreeterWithDefault {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}

object Traits {
  class DefaultGreeter extends GreeterWithDefault // If we use Greeter instead of GreeterWithDefault, it will return an error.

  class CustomizableGreeter(prefix: String, postfix: String) extends GreeterWithDefault {
    override def greet(name: String): Unit = {
      println(prefix + name + postfix)
    }
  }

  def main(args: Array[String]): Unit = {
    val greeter = new DefaultGreeter
    greeter.greet("Recep")

    val cumtomGreeter = new CustomizableGreeter("How are you, ", "?")
    cumtomGreeter.greet("Recep")
  }
}
