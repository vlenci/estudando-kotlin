package collections

fun main() {
    val array = Array(5) { 12345 }

    // array[0] = "A" // NÃO DÁ CERTO, só aceita um tipo de dado

    array[0] = 0
    array[2] = 0
    array[4] = 0

    // array[10] = 777 // ArrayIndexOutOfBoundsException

    println(array.contentToString())

    val arraytwo = arrayOf(1, 2, 3, 4, 5)

    println(arraytwo.contentToString())
}