package lambda.excercises

/**
 * 📝 Description:
 * Define a lambda expression that takes a `String` (a person's name) and
 * returns a `String` (a personalized greeting message).
 *
 * Assign this lambda to a variable called `greetingLambda`.
 *
 * Then, create a function named `greetPerson` that takes a name and uses the
 * `greetingLambda` variable to print a custom greeting to the console.
 *
 * 🎯 Goal:
 * See how a lambda can be stored in a variable and reused.
 */

val greetingLambda: (String) -> String = {
    "Hello $it, how are you doing?"
}

fun main() {
    println(greetPerson("Lençote"))
}

fun greetPerson(name: String) {
    greetingLambda(name)
}