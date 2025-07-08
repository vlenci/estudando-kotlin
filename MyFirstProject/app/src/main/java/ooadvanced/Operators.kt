package ooadvanced

fun main() {

    val s1 = Str("Whatever")
    val s2 = Str("ever")
    val s3 = s1 - s2
    println(s3.teste)

    val s4 = "What" + "at"
}

class Str(val teste: String) {

    operator fun minus(other: Str): Str {
        return Str(teste = teste.replace(other.teste, "") )
    }
}