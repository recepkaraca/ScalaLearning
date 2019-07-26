package Variances

// Contravariance
// s => t
// list[t] => list[s]

abstract class Printer[-A] {
  def print(value: A): Unit
}

class AnimalPrinter extends Printer[Animal] {
  def print(animal: Animal): Unit = {
    println("The animal's name is: " + animal.name)
  }
}

class CatPrinter extends Printer[Cat] {
  def print(cat: Cat): Unit = {
    println("The cat's name is: " + cat.name)
  }
}

object Contravariance {
  def main(args: Array[String]): Unit = {
    val myCat: Cat = Cat("Boots")

    def printMyCat(printer: Printer[Cat]): Unit = {
      printer.print(myCat)
    }

    val catPrinter: Printer[Cat] = new CatPrinter
    val animalPrinter: Printer[Animal] = new AnimalPrinter

    printMyCat(catPrinter)
    printMyCat(animalPrinter)
  }
}
