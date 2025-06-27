package repetition

fun main () {
    var n1 = 1
    var n2 = 1

    while (n1 <= 9) {
        while (n2 <= 9) {
            println("$n1 * $n2 = ${n1 * n2}")
            n2++
        }
        n2 = 1
        n1++
        println()
    }

    for (i in 1..10) {
        for (j in 1..10){
            println("$i x $j = ${i * j}")
        }
        println()
    }
}