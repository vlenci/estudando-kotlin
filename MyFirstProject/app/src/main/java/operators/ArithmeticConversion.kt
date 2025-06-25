package operators

fun main () {
    val a = 10
    val b = 3

    println(a / b) // Os tipos das variáveis se mantem no resultado da operação

    val c = 10.0
    val d = 3



    println(c / d) // Quando os tipos são diferentes ele pega o tipo mais abrangente
}