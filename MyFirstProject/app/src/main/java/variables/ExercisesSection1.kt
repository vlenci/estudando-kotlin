package variables

import java.util.Locale
import java.util.Scanner

fun main () {

    // EXERCÍCIO 1 — Conversor de Temperatura
    // Crie um programa que leia uma temperatura em Celsius informada pelo usuário,
    // e converta essa temperatura para Fahrenheit.
    // Use constantes para armazenar os valores fixos da fórmula de conversão.
    // Exiba o resultado formatado como número decimal.

    val k1: Int = 32
    val k2: Double = 9.0/5

    val tempCelsius: Double = readln().toDouble()
    val tempFahrenheit: Double = tempCelsius * k2 + k1

    println("A temperatura $tempCelsius ºC eh equivalente a $tempFahrenheit ºF ")

    // EXERCÍCIO 2 — Analisador de Caractere
    // Crie um programa que leia um único caractere do teclado.
    // O programa deve informar:
    // - Se o caractere é uma letra (A-Z ou a-z)
    // - Se é um dígito (0-9)
    // - Ou se é outro tipo de símbolo.
    // Além disso, deve exibir o código Unicode do caractere digitado.

    print("Insira um caractere: ")

    val scanner = Scanner(System.`in`)
    scanner.useLocale(Locale.US)  // <- esta linha é essencial!
    val c = scanner.next().single()


    if ((c.code in 65..90) || (c.code in 97..122)) {
        println("O caractere $c eh uma letra!")
    } else if (c.code in 48..57) {
        println("O caractere $c eh um numero")
    } else {
        println("O caractere $c eh especial")
    }

    println("Código Unicode: ${c.code}")

    // EXERCÍCIO 3 — Soma de Números com Conversão
    // Faça um programa que:
    // 1. Leia um número inteiro digitado pelo usuário
    // 2. Leia um número decimal (ponto flutuante) digitado pelo usuário
    // O programa deve calcular e exibir:
    // - A soma dos dois valores como Double
    // - A soma dos dois valores como Int (convertendo o decimal para inteiro antes)

    print("Insira um inteiro: ")
    val i = scanner.nextInt()

    print("Insira um número decimal: ")
    val d = scanner.nextDouble()

    val soma1 = i.toDouble() + d
    val soma2 = i + d.toInt()

    println("Soma em ponto flutuante: $soma1")
    println("Soma em inteiro: $soma2")
}

