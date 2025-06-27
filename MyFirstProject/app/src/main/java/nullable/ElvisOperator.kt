package nullable

fun main () {

    val value: Int? = null

    // val value2 = if(value != null) value else 0
    //println(value2)

    val value2 = value ?: 0 // Muito mais fácil
    println(value2)
}