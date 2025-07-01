package oo.polimorphism

fun main() {
    // Classe Anonima: Só faz sentido pra usar uma ÚNICA vez
    val vehicle = object : Vehicle {
        override fun drive() {
            println("Driving")
        }
    }

    vehicle.drive()
}

interface Vehicle {
    fun drive()
}

