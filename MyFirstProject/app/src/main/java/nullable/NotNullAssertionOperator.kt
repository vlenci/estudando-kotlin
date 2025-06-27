package nullable

fun main () {

    val s: String? = null
    val i = s!!.reversed() // Só usar quando tiver CERTEZA que não vei ser null, o que não é o caso.

    println()
}