package collections

fun main() {

    println(sum(2, 5, 7 , 10))

    val a = intArrayOf(2, 5, 6 ,7, 8, 9, 24)
    println(sum(*a))

}

//fun sum(n1: Int, n2: Int): Int {
//    return n1 + n2
//}

fun sum(vararg values: Int): Int {
    var total = 0
    values.forEach { total += it }
    return total
}