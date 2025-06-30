package functions

fun main() {
    val age1 = dogToHumanAge()
    println(age1)
}

fun dogToHumanAge(): Int {
    val dogAge = readln().toInt()
    return dogAge * 7
}