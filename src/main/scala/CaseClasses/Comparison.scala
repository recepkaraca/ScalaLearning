package CaseClasses

object Comparison {

  case class Message(sender: String, recipient: String, body: String)

  def main(args: Array[String]): Unit = {
    val message1 = Message("recepkaraca@yandex.com", "anyone@anymail.com", "Hi there!")
    val message2 = Message("recepkaraca@yandex.com", "anyone@anymail.com", "Hi there!")
    val messagesAreSame = message1 == message2
    println(messagesAreSame)  // True
  }
}
