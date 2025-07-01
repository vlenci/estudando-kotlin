package oo.classes

fun main() {
    var r1 = Rectangle(10, 40)
    println(r1.width)
    println(r1.height)
    println(r1.surface)
}

class Rectangle(
    width: Int, height: Int
) {

    var width: Int = width
//  Quando o get vai ser usado da maneira padrão, não é necessário "sobrescrever" a função
//        get() {
//            return field
//        }
        private set(value) {
            if (value >= 0) {
                field = value
            }
        }

    var height: Int = height
        private set

    val surface
        get() = width * height

}
