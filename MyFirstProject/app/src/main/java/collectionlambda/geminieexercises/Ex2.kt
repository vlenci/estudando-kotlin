package collectionlambda.geminieexercises


fun main() {
    val names = listOf("Alice", "Bob", "Charlie", "David")

    val namesLength: MutableList<Int> = mutableListOf()

    names.forEach {
        namesLength.add(it.length)
    }

    println(namesLength)

    // Create a new list called 'nameLengths' with the result.
    // Expected output for nameLengths: [5, 3, 7, 5]
    // Then, print the 'nameLengths' list.
}