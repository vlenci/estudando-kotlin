package selection

fun main () {

    var x = -20

    while (x <= 20) {
        when {
            x > 0 -> println("POSITIVO")
            x < 0 -> println("NEGATIVO")
            else -> println(0)
        }
        x++
    val isPar = when {
        x % 2 == 0 -> "PAR"
        x % 2 != 0 -> "IMPAR"
        else -> "LOUCURA"
    }
    println(isPar)

    }

}