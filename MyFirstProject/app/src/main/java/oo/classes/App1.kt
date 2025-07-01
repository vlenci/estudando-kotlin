package oo.classes

fun main() {
    val ac1 = Account("1234-1", "Jota")
    val ac2 = Account("4422-5", "Maria")
    val ac3 = Account()
    val ac4 = Account("9999-7", "Leandro", 1040.50)


    ac1.deposit(2000.0)
    ac2.deposit(35.0)
    ac4.deposit(100)

    ac1.printAccount()
    ac2.printAccount()
    ac4.printAccount()

    val c = CharGenerator('A', 'Z')
    println(c.generateChar())
    println(c.generateChar())
    println(c.generateChar())
}