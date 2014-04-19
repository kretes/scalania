package pl.japila.scalania.euler

object Euler_P01 {

  val solutions = List[(Int, Int, Int) => Int](
    findSumOfMultiplies
  )

//  def findSumOfMultiplies: (Int, Int, Int) => Int = (a: Int, b: Int, limit: Int) => {
//    (for {
//      candidate <- 1.to(limit-1)
//      if candidate % 3 ==0 || candidate % 5 ==0
//    }yield candidate).sum
//  }
//
  def findSumOfMultiplies: (Int, Int, Int) => Int = (a: Int, b: Int, limit: Int) => {
    (0 until limit).filter(n => isDivisableBy5Or3(n)).sum
  }


  def isDivisableBy5Or3(n: Int): Boolean = {
    n % 3 == 0 || n % 5 == 0
  }
}
