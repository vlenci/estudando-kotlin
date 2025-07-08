package collectionlambda

fun main() {

    val products = mapOf(
        "Alface" to 2.5,
        "Arroz" to 6.9,
        "Banana" to 4.8,
        "Sal" to 2.4
    )

    val higherPrice = products
        .map { it.value }
        .maxBy { it }

    println(higherPrice)

    val cheaperProduct = products
        .minBy { it.value }
        .key

    println(cheaperProduct)

    val lowerThanFive = products
        .filter { it.value < 5 }
        .keys

    println(lowerThanFive)
}