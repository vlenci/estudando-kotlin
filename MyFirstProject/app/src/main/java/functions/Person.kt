package functions

class Person(
    private val nome: String
) {
    var distance: Int = 0
    var drankWater: Boolean = true

    fun walk() {
        if (!drankWater) {
            println("$nome precisa tomar água para continuar caminhando.")
            return
        }

        distance += 1000
        println("$nome caminhou $distance m")

        if (distance % 5000 == 0) {
            println("$nome atingiu $distance m e precisa beber água.")
            drankWater = false
        }
    }


    fun drinkWater() {
        drankWater = true
    }

}