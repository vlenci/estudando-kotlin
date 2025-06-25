package variables

import java.util.Scanner

fun main () {

//    Duas formas de fazer a mesma coisa:

//    print("> ")
//    val n1 = readln().toInt()
//
//    print("> ")
//    val n2 = readln().toInt()
//
//    println("A soma eh: ${n1 + n2}")

    val scanner = Scanner(System.`in`)
    print("> ")
    val n1 = scanner.nextInt() // Tem varios tipos de 'next'

    print("> ")
    val n2 = scanner.nextInt()

    println("A soma eh: ${n1 + n2}")
}