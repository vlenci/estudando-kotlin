package oo.polimorphism

interface A {
    fun a()
}

interface B : C{
    fun b()
}

interface C {
    fun c()
}

class Impl : A, B {
    override fun a() {
        TODO("Not yet implemented")
    }

    override fun b() {
        TODO("Not yet implemented")
    }

    override fun c() {
        TODO("Not yet implemented")
    }
}