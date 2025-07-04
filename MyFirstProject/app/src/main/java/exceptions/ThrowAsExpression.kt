package exceptions

fun main() {

    val i : Int? = null

    val d = i?.toDouble() ?: throw IllegalArgumentException() // Se for nulo, dispara exceção

    println(d)
}