package oo.classes

class Account(
    val accountNumber: String,
    val accountOwner: String
) {

    private var balance: Double = 0.0

    constructor() : this("", "") {
        println("Construtor $accountNumber")
    }

    constructor(accountNumber: String, accountOwner: String, balance: Double) : this(accountNumber, accountOwner) {
        this.balance = balance
    }

    public fun deposit(amount: Double) {
        balance += amount
    }

    fun deposit(amount: Int) {
        balance += amount
    }

    fun printAccount() {
        println("Number: $accountNumber\nOwner: $accountOwner\nBalance: $balance")
    }

}