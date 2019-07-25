package CaseClasses

object Copying {

  case class Message(sender: String, recipient: String, body: String)

  def main(args: Array[String]): Unit = {
    val message1 = Message("recepkaraca@yandex.com", "anyone@anymail.com", "Hi there!")
    val message2 = message1.copy(sender = message1.sender, recipient = "anothermail@anymail.com")
    println(message2.sender)
    println(message2.recipient)
    println(message2.body)
  }
}
