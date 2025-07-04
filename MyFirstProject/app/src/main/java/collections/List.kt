package collections

fun main() {

    val l1 = listOf(1, 2, 3, 4, 5)
    val l2: List<Int> = emptyList()
    val l3 = mutableListOf(1, 2, 3, 4)
    val l4 = listOfNotNull(1, 2, 3, null, )

    l3.add( 2, 10)



    l3.forEach { println(it) }
}