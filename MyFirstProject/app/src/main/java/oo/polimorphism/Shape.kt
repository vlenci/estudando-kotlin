package oo.polimorphism

fun main() {

    val square = Square()
    println(square.vertexNumber)

    val triangle = Triangle()
    println(triangle.vertexNumber)
}

abstract class Shape {
    open val vertexNumber: Int = 0
}


// Duas formas diferentes de fazer a mesma coisa:
// Sobrescrever propriedades da classe Shape
class Square : Shape() {
    override val vertexNumber: Int = 4
}

class Triangle(
    override val vertexNumber: Int = 3
) : Shape()