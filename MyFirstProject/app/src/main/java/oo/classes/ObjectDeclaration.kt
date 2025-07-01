package oo.classes

fun main () {
    println(Math2.sum(5, 5))
    println(Math2.subtract(10, 5))
    println(Math2.pi)
}

object Math2 {
    val pi = 3.1416 // Ao contrário da companion object, dá pra usar a propriedade

    fun subtract(a: Int, b: Int) = a - b

    fun sum (a: Int, b: Int) = a + b

}