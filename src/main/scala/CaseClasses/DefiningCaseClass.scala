package CaseClasses

object DefiningCaseClass {

  case class Message(sender: String, recipient: String, body: String)

  def main(args: Array[String]): Unit = {
    val message1 = Message("recepkaraca@yandex.com", "anyone@anymail.com", "Hi there!")

    println(message1.sender)
    // message1.body = "How about?" => Compile error, re-assignment a val.
  }
}
