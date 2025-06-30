package functions

class Smartphone (
    private var model: String,
    var nivelBateria: Int
){
    var emLigacao = false
    var ligado = false

    fun ligar() {
        if(nivelBateria > 0) {
            ligado = true
            println("O celular foi ligado")
        }
    }

    fun usarAplicativo(minutos: Int) {
        var tempo = minutos
        if (ligado) {
            while (tempo > 0) {
                if (nivelBateria > 0) {
                    nivelBateria--
                    tempo--
                } else {
                    println("A bateria do celular acabou")
                    return
                }
            }
        } else {
            println("O celular está desligado, não é possível usar aplicativo")
        }
    }

    fun iniciarChamada(minutos: Int) {
        emLigacao = true
        var tempo = minutos
        if (ligado) {
            while (tempo > 0) {
                if (nivelBateria > 0) {
                    nivelBateria -= 2
                    tempo--
                } else {
                    println("A bateria do celular acabou")
                    emLigacao = false
                    return
                }
            }
            emLigacao = false
        } else {
            println("O celular está desligado, não é possível iniciar chamada")
        }
    }
}