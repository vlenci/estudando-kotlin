package functions

fun main() {
    sayHey()
    sayHey("Nicio", "I love you")
    sayHey(message = "How are you doing?")
}

private fun sayHey(name: String = "Fulano", message: String = "...") {
    println("Hey $name! $message")
}