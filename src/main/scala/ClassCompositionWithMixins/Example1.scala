package ClassCompositionWithMixins

object Example1 {
  abstract class A {
    val message: String
  }
  class B extends A {
    val message = "I'm an instance of class B"
  }
  trait C extends A {
    def loudMessage = message.toUpperCase()
  }
  class D extends B with C

  def main(args: Array[String]): Unit = {
    val d = new D
    println(d.message)
    println(d.loudMessage)
  }
}
