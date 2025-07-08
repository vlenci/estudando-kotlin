package collectionlambda.geminieexercises

// Your code goes here

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = numbers.filter {
        it % 2 == 0
    }.forEach {
        println(it)
    }
    // Create a new list called 'evenNumbers' with the result.
    // Then, print the 'evenNumbers' list.
}