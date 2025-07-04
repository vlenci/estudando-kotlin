package collections

fun main() {

    val cities = listOf("Curitiba", "Los Angeles", "Barcelona", "João Pessoa", "Aspen", "Curitiba")

    val citiesUnique = cities.toSet() // Tira as duplicadas

    println("Quantidades de cidades visitadas: ${citiesUnique.size}")

}