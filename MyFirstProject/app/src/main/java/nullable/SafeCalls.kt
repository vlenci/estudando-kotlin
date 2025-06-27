package nullable

fun main () {

    //val s1: String? = "abcde"
    val s1: String? = null
    println(s1)

    val s2 = s1?.uppercase()
    println(s2)

    val s3 = s2?.reversed()
    println(s3)

    val l = s2?.length
    println(l)
}