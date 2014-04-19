package pl.japila.scalania.s99

object S99_P07 {
  def flatten(ls: Seq[Any]): Seq[Any] = ls.map {
    case head :: tail => head :: flatten(tail).toList
    case any  => Seq(any)
  }
}
