package oo.polimorphism

fun main() {
    // FALTA TERMINAR ALI PAPI
    val account = Account(object: Nameable {
        override val firstName: String = "Carlos"
        override val lastName: String = "Lacerda"

    })

    account.deposit(100.40)
    account.print()

}

class Account(val owner: Nameable) : Printable{
    private var balance: Double = 0.0

    fun deposit(value: Double) {
        balance += value
    }

    override fun print() {
        println("Balance for ${owner.fullName}: $balance")
    }
}

interface Nameable {
    val firstName: String
    val lastName: String
    val fullName: String
        get() = "$firstName $lastName"
}

interface Printable {
    fun print()
}