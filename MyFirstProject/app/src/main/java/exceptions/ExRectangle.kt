package exceptions

fun main() {
    val r1 = Rectangle(3.0, 4.0)
    val r2 = Rectangle(3.0, -3.0)
}

data class Rectangle(val width: Double, val height: Double) {

    init {
        // Por padrão o require lança uma IllegalArgumentException
        require(width > 0) {"A largura do retangulo deve ser positiva"}
        require(height > 0) {"A altura do retangulo deve ser positiva"}
    }
}