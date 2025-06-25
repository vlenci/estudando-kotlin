package selection

import java.util.Scanner

fun main () {
    /*
 * EXERCÍCIO 1 — Conversor de Dia da Semana
 *
 * Escreva um programa que leia um número inteiro de 1 a 7 e imprima o nome do dia da semana correspondente:
 * 1 → Domingo
 * 2 → Segunda-feira
 * 3 → Terça-feira
 * 4 → Quarta-feira
 * 5 → Quinta-feira
 * 6 → Sexta-feira
 * 7 → Sábado
 *
 * Se o número estiver fora desse intervalo, o programa deve imprimir "Dia inválido".
 *
 * Requisito: use a expressão 'when' para fazer a associação entre número e nome do dia.
 */

    val scanner = Scanner(System.`in`)
    val dia = scanner.nextInt()

    when (dia) {
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")
        4 -> println("Quarta")
        5 -> println("Quinta")
        6 -> println("Sexta")
        7 -> println("Sabado")
        else -> println("Dia invalido")
    }

    /*
 * EXERCÍCIO 2 — Calculadora Simples com Operadores
 *
 * Faça um programa que:
 * 1. Leia dois números do usuário
 * 2. Leia um caractere representando a operação desejada: '+', '-', '*', ou '/'
 * 3. Use a expressão 'when' para executar a operação correspondente e imprimir o resultado.
 *
 * Regras adicionais:
 * - Se o operador for inválido, exibir "Operação inválida".
 * - Para a divisão, deve-se tratar o caso de divisão por zero.
 */

    print("Insira o primeiro numero: ")
    val n1 = scanner.nextDouble()
    print("Insira o segundo numero: ")
    val n2 = scanner.nextDouble()

    print("Insira o operador: ")
    val op = scanner.next().single()


    when (op) {
        '+' -> println(n1 + n2)
        '-' -> println(n1 - n2)
        '*' -> println(n1 * n2)
        '/' -> if(n1 != 0.0 && n2 != 0.0){println((n1 / n2))}
        else -> println("Operador invalido")
    }


}