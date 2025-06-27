package nullable

fun main () {
    var password: String? = "abcde"
    password = null
    val defaultPassword = password ?: "1234"

    val mask = "".padEnd(defaultPassword.length, '*')

    println(mask)


}