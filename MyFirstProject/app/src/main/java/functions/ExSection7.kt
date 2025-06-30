package functions

fun main() {

    showPurchaseSummary(
        valorOriginal = 50.0,
        porcentagem = 20.0,
        clienteVip = false
    )
}

private fun calculateDiscount(
    valorOriginal: Double,
    porcentagem: Double = 5.0,
    clienteVip: Boolean = false
): Double = if (clienteVip) {
    valorOriginal * (1 - porcentagem / 100) * 0.98
} else {
    valorOriginal * (1 - porcentagem / 100)
}


private fun showPurchaseSummary(
    valorOriginal: Double,
    porcentagem: Double = 5.0,
    clienteVip: Boolean = false
) {
    val valorFinal = calculateDiscount(valorOriginal, porcentagem, clienteVip)
    println("Valor original da compra: $valorOriginal")
    println("Valor final da compra: $valorFinal")
    println("Valor economizado: ${valorOriginal - valorFinal} ")
}

 private fun  diagnosePacient(temp: Double, bpm: Int, name: String) = conditionPacient(temp)

private fun conditionPacient(temp: Double): Unit {
    if (temp !in 30.0..42.0) {
        error("Temperatura crítica: $temp")
    } else {
        println("Condição boa")
    }
}