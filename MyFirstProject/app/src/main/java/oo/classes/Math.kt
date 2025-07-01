package oo.classes

fun main () {
    println(Math.sum(5, 5)) // Dá pra chamar sem instanciar objeto.
}

class Math {
    val x: Int = 5

    companion object {
        fun sum (a: Int, b: Int) = a + b // Não consegue acessar propriedades (x)
    }
}