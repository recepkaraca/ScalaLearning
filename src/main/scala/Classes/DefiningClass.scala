package Classes

object DefiningClass {
  class Point(var x: Int, var y: Int) {

    def move(dx: Int, dy: Int): Unit = {
      x = x + dx
      y = y + dy
    }

    override def toString: String = s"($x, $y)"
  }

  def main(args: Array[String]): Unit = {
    val point1 = new Point(2, 3)
    println(point1.x)
    println(point1)
    point1.move(1, 2)
    println(point1)
  }
}
