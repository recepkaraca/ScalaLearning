package GenericClasses

object GenericClasses {
  class Stack[A] {
    private var list: List[A] = Nil
    def push(x: A) = {list = x :: list}
    def peek: A = list.head
    def pop(): A = {
      val top = list.head
      list = list.tail
      top
    }
  }

  class Fruit
  class Apple extends Fruit
  class Banana extends Fruit

  def main(args: Array[String]): Unit = {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    println(stack.pop())
    println(stack.pop())


    val stack2 = new Stack[Fruit]
    val apple = new Apple
    val banana = new Banana
    stack2.push(apple)
    stack2.push(banana)
  }
}
