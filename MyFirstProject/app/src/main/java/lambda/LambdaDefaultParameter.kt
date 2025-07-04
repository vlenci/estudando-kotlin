package lambda

fun main() {

    val f: (Int) -> Int = { x -> x * 2}

    // Quando só tem um parâmetro
    val f2: (Int) -> Int = { it * 2 }

}