package Basics

object VarsBlocksFuncsMethods {
  def main(args: Array[String]): Unit = {
    // Variables:
    var x = 1 + 1
    x = 3 //Successfully assignable but values cannot be re-assigned.
    println(x)

    // Blocks:
    println({
      val x = 1 + 1
      x + 1
    })

    // Functions:
    val addOne = (x: Int) => x + 1
    println(addOne(1))

    val addFnc = (x: Int, y: Int) => x + y
    println(addFnc(5, 2))

    // Methods
    def addMtd(x: Int, y:Int): Int = {
      x + y
    }
  }
}
