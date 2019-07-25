package PatternMatching

object SealedClasses {

  sealed abstract class Furniture

  case class Couch() extends Furniture

  case class Chair() extends Furniture

  def findPlaceToSit(place: Furniture): String = place match {
    case a: Couch => "Lie on the couch"
    case b: Chair => "Sit on the chair"
  }

  // Traits and classes can be marked sealed which means all subtypes must be declared in the same file.
}
