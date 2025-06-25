package operators

fun main() {
    // AND (&&) - Verdadeiro somente se ambos forem true
    println("true && true = ${true && true}")     // true
    println("true && false = ${true && false}")   // false
    println("false && true = ${false && true}")   // false
    println("false && false = ${false && false}") // false

    println()

    // OR (||) - Verdadeiro se pelo menos um for true
    println("true || true = ${true || true}")     // true
    println("true || false = ${true || false}")   // true
    println("false || true = ${false || true}")   // true
    println("false || false = ${false || false}") // false

    println()

    // NOT (!) - Inverte o valor booleano
    println("!true = ${!true}")   // false
    println("!false = ${!false}") // true
}
