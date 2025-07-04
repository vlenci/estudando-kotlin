package lambda.excercises

/**
 * 📝 Description:
 * Create a higher-order function named `operateOnNumbers` that takes two integers
 * and a lambda expression as its arguments.
 *
 * The lambda expression should define a contract that accepts two integers and
 * returns an integer result.
 *
 * Your `operateOnNumbers` function must invoke the lambda with the two numbers
 * it received and then return the final result.
 *
 * 🎯 Goal:
 * To test it, call `operateOnNumbers` with some numbers and a lambda that
 * performs addition.
 */

fun main() {
    val res = operateOnNumbers(10, 20) { a, b -> a * b }

    println(res)

}

fun operateOnNumbers(a: Int, b: Int, l: (Int, Int) -> Int): Int {
    return l(a, b)
}