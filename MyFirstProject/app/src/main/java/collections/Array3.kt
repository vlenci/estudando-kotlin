package collections

fun main () {

    val circles = arrayOf(
        Circle(1.0),
        Circle(3.0),
        Circle(4.0)
    )

    // Não é comum
    repeat(circles.size) {
        val circle = circles[it]
        val surface = circle.surface()
        println(surface)
    }

    for (i in circles.indices) {
        val circle = circles[i]
        val surface = circle.surface()
        println(surface)
    }

    // FORMA MAIS COMUM
    circles.forEach {
        val surface = it.surface()
        println(surface)
    }

}

class Circle(val radius: Double) {
    fun surface() = Math.PI * radius * radius
}