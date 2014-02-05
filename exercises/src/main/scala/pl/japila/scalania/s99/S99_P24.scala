package pl.japila.scalania.s99

import scala.util.Random

object S99_P24 {
  def lotto(count: Int, max: Int): Seq[Int] = new Range(0,count,1).map(_ => Random.nextInt(max))
}
