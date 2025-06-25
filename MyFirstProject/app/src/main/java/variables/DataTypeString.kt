package variables

fun main () {

    val s1 = "what"
    val s2 = "ever"

    // val s1s2 = "Soma: " + s1 + s2

    val s1s2 = "Soma: $s1$s2, o tamanho eh: ${(s1 + s2).length}" // String Template

    println(s1s2)
}