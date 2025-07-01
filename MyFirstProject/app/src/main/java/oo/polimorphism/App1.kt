package oo.polimorphism

fun main () {
    val b1 = Coffee()
    b1.prepare()
}

open class Drink {

    open fun prepare() {
        println("Prepare Drink")
    }
}

class Coffee : Drink() {

    override fun prepare() {
        super.prepare()
        println("Prepare Coffee")
    }
}