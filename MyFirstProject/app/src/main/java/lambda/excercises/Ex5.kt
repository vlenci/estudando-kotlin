package lambda.excercises

/**
 * 📝 Description:
 * Create a higher-order function named `transformString`. This function will accept
 * a `String` and a lambda as arguments.
 *
 * The lambda should take a `String` as its single parameter and return a
 * modified `String`.
 *
 * Your `transformString` function must apply this lambda to its input string and
 * print the result.
 *
 * 🎯 Goal:
 * When you call `transformString`, use the implicit `it` parameter in your lambda
 * to transform the input string to uppercase. This exercise highlights Kotlin's
 * concise syntax for single-parameter lambdas.
 */

fun main() {
    transformString("salve salve") { it.uppercase() }
}

fun transformString(s: String, lamb: (String) -> String) {
   println(lamb(s))
}