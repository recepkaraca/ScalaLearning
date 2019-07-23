package Basics

object Classes {
  class Greeter(prefix: String, suffix: String){
    def greet(name: String): Unit = {
      println(prefix + name + suffix)
    }
  }

  def main(args: Array[String]): Unit = {
    val greeter = new Greeter("Hello, ", "!")
    greeter.greet("Recep")
  }
}
