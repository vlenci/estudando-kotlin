package collections

fun main() {
    val s = sortedSetOf(Comparator.naturalOrder(), 1, 3, 5, 7 , 4, 6)
    println(s)

    val dogs = sortedSetOf(
        Comparator.comparing { dog: Dog -> dog.name },
        Dog("Orianna"),
        Dog("Zed"),
        Dog("Corki"),
    )
    println(dogs)
}