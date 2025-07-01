package oo.classes

fun main() {
    val a1 = Account2()
    val a2 = Account2(200.00)
    a1.deposit(100.00)
    a2.withdraw(150.00)
    println(a1.balance)
    println(a2.balance)
 // a1.balance = 100.00 -> Não dá certo porque o 'set' é private
 // val a3 = Account2(-100.00) -> Não dá certo por causa do 'init'
}
class Account2(
    balance: Double = 0.0
) {
    init {
        require(balance >= 0.0)
        println(balance)

    }

    var balance: Double = balance
        private set

    fun deposit(value: Double) {
        require(value >= 0)
        balance += value
    }

    fun withdraw(value: Double) {
        require(value >= 0)
        balance -= value
    }
}