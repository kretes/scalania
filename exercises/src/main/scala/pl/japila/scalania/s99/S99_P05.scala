package pl.japila.scalania.s99

object S99_P05 {
  def reverse[T](ts: Seq[T]): Seq[T] = {
    ts match {
      case Seq() => Seq.empty[T]
      case _ => ts.last +: reverse(ts.dropRight(1))
    }
  }

  // mozna zrobic foldleftem albo foldrightem
}