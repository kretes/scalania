package pl.japila.scalania.s99

object S99_P09 {
  def pack[T](ts: Seq[T]): Seq[Seq[T]] = ts.groupBy(identity).values.toStream.force.toList.sortBy((seq) => seq.head.toString)
}
