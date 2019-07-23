package Basics

object IdFactory {
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
  }
}

object Objects {
  def main(args: Array[String]): Unit = {
    val newId = IdFactory.create()
    println(newId)
    val newerId = IdFactory.create()
    println(newerId)
  }
}
