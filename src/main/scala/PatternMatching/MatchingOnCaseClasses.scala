package PatternMatching

object MatchingOnCaseClasses {

  abstract class Notification

  case class Email(sender: String, title: String, body: String) extends Notification

  case class SMS(caller: String, message: String) extends Notification

  case class VoiceRecording(contactName: String, link: String) extends Notification

  def showNotification(notification: Notification): String = {
    notification match {
      case Email(email, title, _) =>
        s"You have an email from $email with title: $title"
      case SMS(_, _) =>
        "You have a SMS"
      case VoiceRecording(_, _) =>
        "You have a Voice Recording"
    }
  }

  def main(args: Array[String]): Unit = {
    val someMail = Email("recepkaraca@yandex.com", "Meeting", "Hi")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")

    println(showNotification(someMail))
    println(showNotification(someVoiceRecording))
  }
}
