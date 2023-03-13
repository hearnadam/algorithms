package Sort

import com.hearnadam.Sort.Quick
import com.hearnadam.Sort.Merge
import org.scalatest.flatspec._
import org.scalatest.matchers.should.Matchers

class SortTest extends AnyFlatSpec with Matchers {
    val single = Seq(1)
    val multiple = Seq(5, 4, 3, 2, 1)

    behavior of "Quick.Sort"
    it should "'sort' an empty list" in {
        Quick.sort(Seq.empty) shouldBe sorted
    }
    it should "'sort' a list with one value" in {
        Quick.sort(single) shouldBe sorted
    }
    it should "sort a list with multiple values" in {
        Quick.sort(multiple) shouldBe sorted
    }

    behavior of "Merge.Sort"
    it should "'sort' an empty list" in {
        Merge.sort(Seq.empty) shouldBe sorted
    }
    it should "'sort' a list with one value" in {
        Merge.sort(single) shouldBe sorted
    }
    it should "sort a list with multiple values" in {
        Merge.sort(multiple) shouldBe sorted
    }
}