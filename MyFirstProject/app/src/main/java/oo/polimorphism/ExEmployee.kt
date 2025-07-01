package oo.polimorphism

var totalPay: Double = 0.0

fun main () {
    val c1: Worker = Clt(250.25, 120)
    println(c1.pay())

    val f1: Worker = Freelancer(2500.0)
    println(f1.pay())

    pay(c1)
    pay(f1)
    println(totalPay)
}

fun pay(worker: Worker) {
    totalPay += worker.pay()
}

abstract class Worker (var baseSalary: Double) {
    fun pay(): Double{
        return baseSalary * multiplier()
    }

    abstract fun multiplier(): Int
}

class Clt(
    baseSalary: Double,
    var horasTrabalhadas: Int
) : Worker(baseSalary) {

    override fun multiplier(): Int {
        return horasTrabalhadas
    }
}

class Freelancer(
    baseSalary: Double
) : Worker(baseSalary) {

    override fun multiplier(): Int {
        return 1
    }
}