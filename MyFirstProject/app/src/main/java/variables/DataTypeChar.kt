package variables

fun main () {
    val c: Char = 'V'
    println(c)
    println(c.code)

    val c2 = 86
    println(c2.toChar())

    val c3 = 'A'
    println(c3.dec())

    // Existem inúmeros métodos de char, aqui alguns exemplos:
    println(c3.isDigit())
    println(c3.isUpperCase())


}