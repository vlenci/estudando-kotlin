package collections

fun main() {

    val codesMap = sortedMapOf(
     // Comparator.reverseOrder(), -> Opcional para organização
        55 to "Brasil",
        351 to "Portugal",
        54 to "Arxentina",
        1 to "United States"
    )

    println(codesMap)
}