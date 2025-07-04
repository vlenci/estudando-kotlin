package lambda

fun main() {

    console { "Salve" }

    val x = 10

    console {
        val y = (x * 2) * -1
        y + 1
    }

}

fun console(producer: () -> Any) {
    println("**********")
    println(producer())
    println("**********")
}