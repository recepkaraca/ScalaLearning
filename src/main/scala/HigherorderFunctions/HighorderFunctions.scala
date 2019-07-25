package HigherorderFunctions

object HighorderFunctions {
  class Decorator(left: String, right: String) {
    def layout[A](x: A) = left + x.toString + right
  }

  def main(args: Array[String]): Unit = {
    def apply(f: Int => String, v: Int) = f(v)
    val decorator = new Decorator("[", "]")
    println(apply(decorator.layout, 7))
  }
}
