package repetition

import kotlin.random.Random

fun main () {
    val secretNum = Random.nextInt(0, 21)
    var num: Int
    do {
        print("> ")
        num = readln().toInt()

        when {
            num == secretNum -> println("Você advinhou, o numero secreto era $secretNum!!!")
            num < secretNum -> println("O número secreto é maior que $num")
            num > secretNum -> println("O número secreto é menor que $num")
            else -> println("O numero inserido é inválido")
        }

//        if (num == secretNum){
//            println("Você advinhou, o numero secreto era $secretNum!!!")
//        } else if (num < secretNum) {
//            println("O número secreto é maior que $num")
//        } else {
//            println("O número secreto eh menor que $num")
//        }
    } while (num != secretNum)
}