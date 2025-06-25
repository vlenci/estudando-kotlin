package selection

import java.util.Scanner

fun main () {

    val scanner = Scanner(System.`in`)

    val num = scanner.nextDouble()

    var res = num * num

    if (res > 10.0) {
        res = 10.0
    }

    println(res)

}