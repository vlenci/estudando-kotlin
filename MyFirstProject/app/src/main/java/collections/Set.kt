package collections

fun main() {

    val s1 = setOf(1, 2, 2 , 4)
    val s2 = mutableSetOf("A", "B", "C")
    val s3 = hashSetOf("1A", "5B", "10C")

    val s = 10

    s1.forEach { println(it.hashCode()) }

    println(s1)
    s1.forEach { println(it) }
    s2.forEach { println(it) }
    s3.forEach { println(it) }
}