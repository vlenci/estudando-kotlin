package lambda.excercises

/**
 * 📝 Description:
 * Create a "text formatter factory" function named `getFormatter`.
 * This function will accept a String ("uppercase", "lowercase", or "reverse")
 * and will return a lambda that can be used to format text.
 *
 * The returned lambda should always be of the type `(String) -> String`.
 *
 * - If the input is "uppercase", return a lambda that converts a string to uppercase.
 * - If the input is "lowercase", return a lambda that converts a string to lowercase.
 * - If the input is "reverse", return a lambda that reverses a string.
 * - For any other input, return a "default" lambda that simply returns the
 * original string without any changes.
 *
 * 🎯 Goal:
 * Call `getFormatter` to retrieve the "reverse" lambda. Then, use that
 * returned lambda to format a sample string and print the result.
 */

fun main() {
    val l1 = getFormatter("uppercase")
    val l2 = getFormatter("lowercase")
    val l3 = getFormatter("reverse")
    val l4 = getFormatter("anything else")

    println(l1("subinoonibus"))
    println(l2("subinoonibus"))
    println(l3("% subinoonibus $"))
    println(l4("subinoonibus"))
}

fun getFormatter(operation: String): (String) -> String {
    return when (operation) {
        "uppercase" -> { s: String -> s.uppercase() }
        "lowercase" -> { s: String -> s.lowercase() }
        "reverse" -> { s: String -> s.reversed() }
        else -> {s: String -> s}
    }
}