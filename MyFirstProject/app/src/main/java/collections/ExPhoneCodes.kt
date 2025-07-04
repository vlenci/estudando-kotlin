package collections

import java.util.SortedSet

fun main() {
    val ddd: Map<Int, String> = mapOf(
        14 to "Brotas",
        19 to "Campinas",
        11 to "São Paulo"
    )

    val dddSet: SortedSet<String> = ddd.values.toSortedSet (
        Comparator.reverseOrder()
    )

    val dddList: MutableList<String> = mutableListOf()

    for (i in 0 until dddSet.size) {
        dddList.add(dddSet.elementAt(i))
    }


    dddList.forEach {
        println(it)
    }
}