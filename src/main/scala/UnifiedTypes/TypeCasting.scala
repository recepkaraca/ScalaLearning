package UnifiedTypes

object TypeCasting {
  def main(args: Array[String]): Unit = {
    val x: Float = 456465465
    val y: Float = x

    val face: Char = '☺'
    val number: Int = face

    val xx: Long = 456465465
    val yy: Float = xx
    //val zz: Long = yy (Compile error => Type casting float to long)
  }
}
