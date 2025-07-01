package oo.polimorphism

fun main() {
    val a: Dog = Dog()
    a.run()
    a.eat()

    val b: Animal = Dog()
    val c: Dog = b as Dog // Tem que tomar cuidado
//    b.run()
    b.eat()
    c.run()
}

abstract class Animal {

    fun eat() {
        println("Eating...")
    }
}

class Dog: Animal() {

    fun run() {
        println("Running...")
    }
}

class Cat : Animal() {

    fun sleep() {
        println("Zzz...")
    }
}