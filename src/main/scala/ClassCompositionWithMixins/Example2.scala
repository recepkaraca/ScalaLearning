package ClassCompositionWithMixins

object Example2 {
  abstract class AbsIterator {
    type T
    def hasNext: Boolean
    def next: T
  }
  class StringIterator(s: String) extends AbsIterator {
    type T = Char
    private var i = 0
    def hasNext = i < s.length
    def next = {
      val ch = s charAt i
      i += 1
      ch
    }
  }
  trait RichIterator extends AbsIterator {
    def foreach(f: T => Unit): Unit = while (hasNext) f(next)
  }

  def main(args: Array[String]): Unit = {
    class RichStringIter extends StringIterator("test") with RichIterator
    val iter = new RichStringIter
    iter foreach println
  }
}
