package CompoundTypes

trait Clonable extends java.lang.Cloneable {
  override def clone(): Clonable = {
    super.clone().asInstanceOf[Clonable]
  }
}

trait Resetable {
  def reset: Unit
}

object CompoundTypes {/*
  def cloneAndReset(obj: Cloneable with Resetable): Unit = {
    val cloned = obj.clone()
    obj.reset
  }*/
}
