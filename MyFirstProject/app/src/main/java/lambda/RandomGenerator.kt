package lambda

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val g1 = newGenerator(0, 10)

    repeat(10) {
        println("${g1()}")
    }
}

fun newGenerator(min: Int, max: Int): () -> Int {
    return { -> Random.nextInt(min..max) }
}