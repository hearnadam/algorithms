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

    def merge(left: Seq[Int], right: Seq[Int]): Seq[Int] =
        (left, right) match {
            case (left, Nil) => left
            case (Nil, right) => right
            case (left, right) => ???
        }
}
