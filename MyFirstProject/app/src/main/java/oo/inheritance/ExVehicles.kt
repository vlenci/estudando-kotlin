package oo.inheritance

fun main() {
    val v1 = Veiculo("Honda", "Civic", "2021")
    val m1 = Moto("Yamaha", "R15", "2025")
    val c1 = Caminhao("Volvo", "FH 540", "2020")
    v1.exibirFichaTecnica()
    m1.exibirFichaTecnica()
    c1.exibirFichaTecnica()

    m1.empinar()
    c1.carregarCarga()
}

open class Veiculo (
    val marca: String,
    val modelo: String,
    val ano: String
) {

    fun exibirFichaTecnica() {
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Ano: $ano")
    }
}

class Moto(
    marca: String,
    modelo: String,
    ano: String
) : Veiculo(
    marca,
    modelo,
    ano
) {

    fun empinar() {
        println("A moto $marca $modelo empinou!")
    }
}

class Caminhao(
    marca: String,
    modelo: String,
    ano: String
) : Veiculo(
    marca,
    modelo,
    ano
) {

    fun carregarCarga() {
        println("O caminhão $marca $modelo está carregando carga.")
    }
}