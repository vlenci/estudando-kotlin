package lambda

fun main() {

    val s = "3921E3420U09T090E4A0M11O"

    val partitions = s.partition { c -> c.isLetter() }

    println("First: ${partitions.first}")
    println("Second: ${partitions.second}")
}