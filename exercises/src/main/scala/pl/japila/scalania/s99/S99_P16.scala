package pl.japila.scalania.s99

object S99_P16 {


  def drop[T](n: Int, ts: Seq[T]): Seq[T] = {
//
//    def dropO[T](counter: Int, ts: Seq[T]): Seq[T] = ts match {
//      case Nil => Nil
//      case head +: tail => if(counter%n==0) dropO(counter+1,tail) else head +: dropO(counter+1,tail)
//    }
//    dropO(1,ts)

    ts.zipWithIndex.partition(valWithIndex => (valWithIndex._2+1) % n ==0)._2.map(partitions => partitions._1)
  }
}
