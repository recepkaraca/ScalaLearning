package Variances

// Covariance:
// s => t
// list[s] => list[t]

abstract class Animal {
  def name: String
}

case class Cat(name: String) extends Animal
case class Dog(name: String) extends Animal

object Covariance {

  def printAnimalNames(animals: List[Animal]): Unit = {
    animals.foreach(x => println(x.name))
  }

  def main(args: Array[String]): Unit = {
    val cats: List[Cat] = List(Cat("Whiskers"), Cat("Tom"))
    val dogs: List[Dog] = List(Dog("Fido"), Dog("Rex"))

    printAnimalNames(cats)
    printAnimalNames(dogs)
  }
}
