package selection

fun main () {

    val x = 3

    when (x) {
        10 -> println("Eh 10")
        20 -> println("Eh 20")
        30 -> println("Eh 30")
        else -> println("Desconhecido")

    }

    when (x) {
        0, 2, 4, 6, 8 -> println("EH PAR")
        1, 3 ,5, 7, 9 -> println("EH IMPAR")
    }
}