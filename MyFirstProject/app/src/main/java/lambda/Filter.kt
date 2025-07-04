package lambda

fun main() {

    val s1 = "s0dja0sd9j90ja)SJA)D)DJ0ajsd09j0wadsj0a"

    val s2 = s1.filter { it.isDigit() } // { c -> c.isDigit() }

    val s3: String = s1.filterIndexed { i, c ->
        val digit = c.isDigit()
        if (digit) {
            println("Found digit $c in $i position")
        }
        digit
    }

    println(s3)


}