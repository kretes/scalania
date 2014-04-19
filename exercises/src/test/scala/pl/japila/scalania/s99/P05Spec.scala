package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P05.reverse
import scala.annotation.tailrec

class P05Spec extends Specification {

  def fib(max: Int):Int = {
    fib(1,1,max,0);
  }

  @tailrec
  private def fib(prev:Int,current:Int,max:Int,acc:Int):Int = {
    val newCurrent: Int = prev + current
    if ( newCurrent > max)
      acc
    else
      fib(current,newCurrent,max,(if(newCurrent %2==0) acc+newCurrent else acc))
  }

  "Eul 2" should {
    "should work." in {
      fib(10) === 10
    }
  }

  "Eul 2" should {
    "shou3ld work." in {
      fib(4000000) === 4613732
    }
  }
}