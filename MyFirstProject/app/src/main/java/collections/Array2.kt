package collections

fun main() {

    val a1 = arrayOf("A", null, "C")
    val a2 = arrayOfNulls<String>(10)

    println(a1.contentToString())
    println(a2.contentToString())

    val aInt1 = arrayOf(1, 2, 3)
    val aInt2 = intArrayOf(1, 2, 3) // Mais performático

    println(aInt1)
    println(aInt2)
}