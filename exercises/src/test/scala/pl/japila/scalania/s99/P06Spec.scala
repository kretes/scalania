package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P06.isPalindrome
import scala.annotation.tailrec

class P06Spec extends Specification {
  "P06 solution" should {
    "Find out whether a list is a palindrome." in {
      isPalindrome(List(1, 1, 2, 1, 1))
    }

    "Find out whether a list is not a palindrome." in {
      isPalindrome(List(1, 1, 2, 3, 5, 8)) === false
    }
  }

  def takeWhileRec2(function: (Int) => Boolean, list:List[Int]):List[Int] = list match {
    case Nil => Nil
    case head :: tail => if (function(head)) head +: takeWhileRec2(function,tail) else Nil
  }

  def myTakeWhile(function: (Int) => Boolean, list:List[Int]) = {
//    for (elem <- list; if function(elem)) yield elem
//    list.foldLeft(List[Int]())((acc:List[Int],elem:Int) => {if(function(elem) == false) acc else acc :+ elem})
//    takeWhileRec(function,list)
  }
                   //is not tailrec, because it doesn't take params
    def takeWhileRec(function: (Int) => Boolean, list:List[Int]):List[Int] = list match {
      case Nil => Nil
      case head +: tail if function(head) => head +: takeWhileRec(function,tail)
      case _ => Nil
    }

  "takeWhile" should {
    "work the same" in {
      val function: (Int) => Boolean = _ < 3
      val list: List[Int] = List(1, 2, 3)
      takeWhileRec(function,list) must beEqualTo(list.takeWhile(function))
    }
  }


}