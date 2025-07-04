package lambda

fun main() {
    // Primeira função
    val f: (Int) -> Int = { n ->
        val d = n * 2
        println("New value: $d")
        d
    }
    f(4)

    // Segunda função
    val p: (Int) -> Boolean = { num -> num % 2 == 0 }

    println(p(4))
    println(p(3))
}
