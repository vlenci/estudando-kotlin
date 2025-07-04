package lambda.excercises

/**
 * 📝 Description:
 * Write a higher-order function called `repeatAction` that takes an integer `times`
 * and a lambda expression.
 *
 * The lambda should have no parameters and no return value (its type will be `() -> Unit`).
 * This function should execute the given lambda `times` number of times using a loop.
 *
 * 🎯 Goal:
 * To test it, call `repeatAction` with a number (e.g., 3) and a lambda that
 * prints "Hello, Kotlin!" to the console.
 */



fun main() {

    repeatAction(3) {
        println("Hello, Kotlin!")
    }
}

fun repeatAction(times: Int, run: () -> Unit) {
    var n = 0
    while (n < times) {
        run()
        n++
    }
}