package lambda

fun main() {

    // Função anônima:
    val f1 = fun(a: Int, b: Int): Int {
        return a + b
    }

    // Formas diferentes de fazer o mesmo
    println(f1(10, 4))
    println(f1.invoke(10, 4))

    // Lambda:
    val f2: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

    println(f2(10, 4))
}
