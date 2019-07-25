package ExtractorObjects

import scala.util.Random

object ExtractorObjects {
  object CustomerId {

    def apply(name: String) = s"$name--${Random.nextLong}"

    def unapply(customerId: String): Option[String] = {
      val name = customerId.split("--").head
      if(name.nonEmpty) Some(name) else None
    }
  }

  def main(args: Array[String]): Unit = {
    val customer1ID = CustomerId("Sukyoung")
    customer1ID match {
      case CustomerId(name) => println(name)
      case _ => println("Could not extract a CustomerID")
    }

    val customer2ID = CustomerId("Nico")
    val CustomerId(name) = customer2ID
    println(name) // unapply method runs.
  }
}
