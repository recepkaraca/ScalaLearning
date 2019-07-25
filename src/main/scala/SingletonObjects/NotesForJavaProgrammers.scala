package SingletonObjects

// static is not a keyword in Scala. Instead, all members that would be static, including classes,
// should go in a singleton object. They can be referred to with the same syntax, imported piecemeal or as a group, and so on.

//Frequently, Java programmers define static members, perhaps private, as implementation aids for their instance members.
// These move to the companion, too; a common pattern is to import the companion object’s members in the class, like so:

class NotesForJavaProgrammers {
  import NotesForJavaProgrammers._

  def blah = foo
}

object NotesForJavaProgrammers {
  private def foo = 42
}
