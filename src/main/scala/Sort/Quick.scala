package com.hearnadam.Sort

import scala.collection.immutable.Seq

object Quick {
    def sort(list: Seq[Int]): Seq[Int] =
        list match {
            case list if list.size <= 1 => list
            case head :: tail =>
                val (left, right) = tail.partition(_ <= head)
                (sort(left) :+ head) :++ sort(right)
        }
}
