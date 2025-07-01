package oo.polimorphism

fun main() {
    val p = Programador()
    p.work()

    val t = Teacher()
    t.work()

    val prog: Programador = Programador()
    prog.work()

    var a: Programador = ProgramadorKotlin()
    a.work()


    a = Programador()
    a.work()
}

abstract class Employee {

    abstract fun work()
}

open class Programador : Employee() {

    override fun work() {
        println("Programador programando...")
    }
}

class ProgramadorKotlin : Programador() {

    override fun work() {
        println("Programador kotlin programando kotlin...")
    }
}

class Teacher : Employee() {

    override fun work() {
        println("Professor professoriando...")
    }
}