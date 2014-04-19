package pl.japila.scalania.s99

object S99_P06 {
  def isPalindrome[T](ts: Seq[T]): Boolean = ts.zip(ts.reverse) forall { case (a,b) => a==b }

//  def isPalindrome[T](ts: Seq[T]): Boolean = ts.zip(ts.reverse).map((pair) => pair._1 == pair._2).contains(false) == false

//  def isPalindrome[T](ts: Seq[T]): Boolean = ts.reverse == ts

}
