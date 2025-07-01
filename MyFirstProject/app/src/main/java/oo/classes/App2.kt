package oo.classes

fun main() {
    val p1 = Person("Lenci")
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.drinkWater()
    p1.walk()

    val s1 = Smartphone("Iphone 11", 100)
    s1.ligar()
    println(s1.nivelBateria)
    s1.usarAplicativo(5)
    println(s1.nivelBateria)
    s1.iniciarChamada(50)
    println(s1.nivelBateria)
}