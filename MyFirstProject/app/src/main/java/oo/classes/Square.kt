package oo.classes

fun main() {
    val s1 = Square(10)
    val s2 = Square(15)
    val s3 = Square(-10)
}

class Square(val size: Int) {

    init {
        println("Init1")
        require(size > 0) // Caso não atenda a condição, o objeto não é criado
    }
}