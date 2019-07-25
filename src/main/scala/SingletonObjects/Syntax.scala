package SingletonObjects

// Methods and values that aren’t associated with individual instances of a class belong in singleton objects,
// denoted by using the keyword object instead of class.

object Syntax {
  def sum(l: List[Int]): Int = l.sum
}
