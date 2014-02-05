package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P24.lotto
import org.assertj.core.api.Assertions

class P24Spec extends Specification {
  "P24 solution" should {
    "Lotto: Draw N different random numbers from the set 1..M." in {
      val randomrange = lotto(6, 49)
      Assertions.assertThat(randomrange.distinct.size).isEqualTo(6)
      Assertions.assertThat(randomrange.min).isGreaterThanOrEqualTo(1)
      Assertions.assertThat(randomrange.max).isLessThanOrEqualTo(49)
      true
    }

  }
}