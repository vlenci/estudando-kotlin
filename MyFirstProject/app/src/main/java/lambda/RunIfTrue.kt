package lambda

fun main() {
    runIfTrue(true) { println("Hello World") }

    val x = 12

    val r = runIfTrue(x > 5) {
        println("Code executed")
        x
    }

    println(r)

}

fun runIfTrue(condition: Boolean, run: () -> Any): Any? {
    if (condition) {
        return run()
    } else {
        return null
    }
}