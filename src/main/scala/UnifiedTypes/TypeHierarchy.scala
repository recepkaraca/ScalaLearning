package UnifiedTypes

object TypeHierarchy {
  def main(args: Array[String]): Unit = {
    val list: List[Any] = List (
      "a string",
      732,
      'c',
      true,
      () => "a function"
    )

    list.foreach(x => println(x))
  }
}
