package SelfType

trait User {
  def username: String
}

trait Tweeter {
  this: User =>
  def tweet(tweetText: String) = println(s"$username: $tweetText")
}

class VerifiedTweeter(val username_ : String) extends Tweeter with User {
  override def username: String = s"real $username_"
}

object SelfType {
  def main(args: Array[String]): Unit = {
    val realBeyonce = new VerifiedTweeter("Beyonce")
    realBeyonce.tweet("Just spilled my glass of lemonade")
  }
}
