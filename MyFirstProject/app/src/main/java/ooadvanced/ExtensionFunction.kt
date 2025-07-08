package ooadvanced

fun main() {

    val sum = listOf(1, 2, 3, 4).sumEvenNumbers()
    println(sum)
}

fun List<Int>.sumEvenNumbers(): Int {
    return this.filter { it % 2 == 0}.sum()
}