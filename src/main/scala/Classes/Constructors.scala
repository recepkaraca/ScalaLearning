package Classes

object Constructors {
  class Point(var x: Int = 0, var y: Int = 0)

  def main(args: Array[String]): Unit = {
    val origin = new Point
    val point1 = new Point(1)
    println("origin => x = " + origin.x + " y = " + origin.y)
    println("point1 => x = " + point1.x + " y = " + point1.y)

    val point2 = new Point(y = 2)
    println("point2 => x = " + point2.x + " y = " + point2.y)
  }
}
