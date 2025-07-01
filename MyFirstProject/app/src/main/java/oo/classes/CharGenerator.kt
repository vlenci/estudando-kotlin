package oo.classes

class CharGenerator(
    val intervalBegin: Char,
    val intervalEnd: Char
) {

    fun generateChar() = (intervalBegin..intervalEnd).random()
}