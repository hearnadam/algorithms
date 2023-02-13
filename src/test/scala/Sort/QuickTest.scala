package com.hearnadam.SortTest

import com.hearnadam.Sort.Quick
import org.scalatest.flatspec._
import org.scalatest.matchers.should.Matchers

class QuickTest extends AnyFlatSpec with Matchers {
    "Quick.Sort" should "'sort' an empty list" in {
        Quick.sort(Seq.empty) shouldBe sorted
    }
    it should "'sort' a list with one value" in {
        Quick.sort(Seq(1)) shouldBe sorted
    }
    it should "sort a list with several values" in {
    val list = Seq(5, 4, 3, 2, 1)
        Quick.sort(list) shouldBe sorted
    }
}