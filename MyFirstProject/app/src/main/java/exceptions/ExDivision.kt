package exceptions

fun main() {
    println(divisao(10, 4))
    println(divisao(10, 0))
}
// MUDAR CONFORME O EX
fun divisao(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (_: ArithmeticException) { // variável que não vai ser usada, convenção -> _
        0
    }
}