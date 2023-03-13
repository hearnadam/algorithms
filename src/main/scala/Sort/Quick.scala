package com.hearnadam.Sort

import scala.collection.immutable.Seq

object Quick extends Sortable {
    def sort(list: Seq[Int]): Seq[Int] =
        list match {
            case list if list.size < 2 => list
            case head :: tail =>
                val (left, right) = tail.partition(_ <= head)
                (sort(left) :+ head) :++ sort(right)
        }
}
