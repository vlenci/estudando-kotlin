package lambda

fun main() {

    val res = transformAndConvert("$", "|", 100, { v -> v * v })
    println(res)

    val res2 = transformAndConvert("$", "|", 4) { v -> -v } // Trailing lambda - fora dos parênteses quando o lambda é a ultima expressão
    println(res2)
}

fun transformAndConvert(prefix: String, suffix: String, value: Int, t: (Int) -> (Int)): String {
    val transformed = t(value)
    return "$prefix$transformed$suffix"
}