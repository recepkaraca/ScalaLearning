package SingletonObjects

class Companions(val x: Int, val y: Int)

object Companions {
  import math.Ordering

  implicit def ipnord: Ordering[Companions] =
    Ordering.by(ip => (ip.x, ip.y))
}
