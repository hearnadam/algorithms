package com.hearnadam.Sort

import scala.collection.immutable.Seq

object Merge extends Sortable {
    def sort(list: Seq[Int]): Seq[Int] =
        list match {
            case list if list.size < 2 => list
            case list =>
                val (left, right) = list.splitAt(list.size / 2)
                merge(sort(left), sort(right))
        }

    private def merge(left: Seq[Int], right: Seq[Int]): Seq[Int] =
        (left, right) match {
            case (left, Nil) => left
            case (Nil, right) => right
            case (leftHead :: leftTail, rightHead :: rightTail) =>
                if (leftHead < rightHead) {
                    leftHead +: merge(leftTail, right)
                } else {
                    rightHead +: merge(left, rightTail)
                }
        }
}
