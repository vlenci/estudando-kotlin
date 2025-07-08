package collectionlambda


fun main() {
    val numbers = listOf(1, 7, 14, 62, 8, 12, 70)


    val numbersMap = numbers
        .sorted()
        .windowed(2)
        .associate { (atual, proximo) ->
            Pair(atual, proximo)
        }

    println(numbersMap)
}