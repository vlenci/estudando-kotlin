package nullable

fun main () {
    var n: Int? = 10 // Nullable Int
    n = 20
    n = null

//    var x = 10
//    x = null <- isso aqui dária erro

    println(n)
}