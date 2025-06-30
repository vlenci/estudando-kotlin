package oo

import kotlin.random.Random

class CharGenerator(
    val intervalBegin: Char,
    val intervalEnd: Char
) {

    fun generateChar() = (intervalBegin..intervalEnd).random()
}