package AbstractTypes

trait Buffer {
  type T
  val element: T
}

abstract class SeqBuffer extends Buffer {
  type U
  type T <: Seq[U]
  def length = element.length
}

abstract  class IntSeqBuffer extends SeqBuffer {
  type U = Int
}

object AbstractTypes {
  def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer = {
    new IntSeqBuffer {
      override type T = List[U]
      override val element: T = List(elem1, elem2)
    }
  }

  def main(args: Array[String]): Unit = {
    val buf = newIntSeqBuf(7, 8)
    println("length = " + buf.length)
    println("content = " + buf.element)
  }
}
