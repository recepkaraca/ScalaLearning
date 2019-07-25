package PatternMatching

object MatchingOnTypeOnly {

  abstract class Device

  case class Phone(model: String) extends Device{
    def screenOff = "Turning screen off"
  }

  case class Computer(model:String) extends Device{
    def screenSaverOn = "Turning screen saver on..."
  }

  def goIdle(device: Device) = device match {
    case p: Phone => p.screenOff
    case c: Computer => c.screenSaverOn
  }

  def main(args: Array[String]): Unit = {
    val phone = Phone("Apple")
    val computer = Computer("Asus")
    val deviceList = List(phone, computer)
    deviceList.foreach(x => println(goIdle(x)))
  }
}
