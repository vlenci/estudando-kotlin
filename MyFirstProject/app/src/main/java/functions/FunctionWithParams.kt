package functions

fun main() {
    sayHi("Vini", 28)
    sayHi("Pedro", 21)
 // sayHi(21, "Sergio") -> isso dá erro porque a ordem dos parâmetros IMPORTA
    sayHi(temperature = 5, name = "Sergio") // isso dá certo porque os param foram nomeados

    println(sumFunc(10,20))

}

private fun sayHi(name: String, temperature: Int) {
    println("Hi $name! Temperature is $temperature degrees.")
}

private fun sumFunc(a: Int, b: Int): Int {
    return a + b
}