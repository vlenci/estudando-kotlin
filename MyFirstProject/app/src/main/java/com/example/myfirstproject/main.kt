package com.example.myfirstproject

fun main () {
    var variavel_declarada = 10
    var variavel_nao_declarada: Int // quando o valor não é declarado tem que ter o tipo

    var nova_variavel = variavel_declarada.toLong()

    val x = 100UL // Dá uma olhada no tipo de 'x' pra você entender o 'UL' -> dificil de ser usado


    println("Hello wwwORLddd! $nova_variavel")


    val c: Char = 'V'
    println(c)
    println(c.code)

    val c2 = 86
    print(c2.toChar())
}
