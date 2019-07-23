package Basics

object CaseClasses {
  case class Point(x: Int, y: Int)

  def main(args: Array[String]): Unit = {
    val point = Point(1, 2)
    val anotherPoint = Point(1, 2)
    val yetAnotherPoint = Point(2, 2)

    if(point == anotherPoint)
      println(point + " and " + anotherPoint + " are the same.")
    else
      println(point + " and " + anotherPoint + " are different.")

    if(point == yetAnotherPoint)
      println(point + " and " + yetAnotherPoint + " are the same.")
    else
      println(point + " and " + yetAnotherPoint + " are different.")
  }
}
