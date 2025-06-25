package variables

fun main () {

    /*
    Não é comunmente utilizado
    Byte -> UByte
    Short -> UShort
    Int -> UInt
    Long -> ULong
     */

    val x = 100U
    val y = 100UL

    val x2 = x.toInt()
    val y2 = y.toDouble()

    val x3 = -20
    val x4 = x3.toUInt()
    println(x4) // Buga legal, porque ele não é responsável por converter pra positivo

}