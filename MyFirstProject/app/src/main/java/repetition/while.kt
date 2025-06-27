package repetition

fun main () {

    var x = 15

    while (x <= 10) {
        print("$x ")
        x++
    }

    x = 15
    println()
    do {
        print("$x ")
        x++
    } while (x <= 10)

}