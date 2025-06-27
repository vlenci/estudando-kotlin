package nullable

fun main () {
    val nome: String?
    val endereco: String?
    val numero: Int?

    fun imprimeEndereco (nome: String?, endereco: String?, numero: Int?) {
        println(
            "Pessoa ${nome ?: "Informação Incompleta"} " +
                    "mora na rua ${endereco ?: "Informação Incompleta"}, " +
                    "número ${numero ?: "Informação Incompleta"}"
        )
    }

    imprimeEndereco("Vini", null, 1234)
    imprimeEndereco("Lençõte", "Rua dos patos", 31)
    imprimeEndereco(null, null, null)

    fun imprimeTamanho (nome: String?) {
        if (nome == null) {
            println("Nome inválido")
        } else {
            println("O nome tem ${nome?.length} caracteres")
        }
    }

    imprimeTamanho("Vinicius")
    imprimeTamanho(null)
}