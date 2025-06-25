package selection

/*
 * EXERCÍCIO
 *
 * Escreva um programa que, com base em uma idade fornecida, classifica a pessoa nos grupos abaixo:
 *
 * - CRIANÇA: 0 a 11 anos
 * - ADOLESCENTE: 12 a 17 anos
 * - ADULTO: 18 a 59 anos
 * - IDOSO: 60 anos ou mais
 */

fun main () {

    print("Insira a sua idade: ")
    val idade = readln().toInt()

    if (idade in 0..11) {
        println("Você é uma criança.")
    } else if (idade in 12..17) {
        println("Você é um adolescente")
    } else if (idade in 18..59) {
        println("Você é um adulto")
    } else if (idade in 60..120){
        println("Você é um idoso")
    } else {
        println("Idade inserida inválida")
    }

}