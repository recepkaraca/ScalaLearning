package ForComprehensions

object Example1 {

  case class User(val name: String, val age: Int)

  def main(args: Array[String]): Unit = {
    val userBase = List(new User("Travis", 28),
      new User("Kelly", 33),
      new User("Jennifer", 44),
      new User("Dennis", 23))

    val twentySomethings = for(user <- userBase if (user.age >= 20 && user.age <= 30))
      yield user.name

    twentySomethings.foreach(x => println(x))
  }
}
