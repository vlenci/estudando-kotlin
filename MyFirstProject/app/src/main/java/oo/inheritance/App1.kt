package oo.inheritance

fun main() {
    val cat = Cat("Preto")
    cat.miau()
    cat.eat()
    //  cat.sleep() -> Mesmo sendo protected não dá pra acessar, apenas dentro da sublclasse

    val dog = Dog("Marrom")
    dog.bark()
    dog.eat()

    println(cat is Animal)
    println(dog is Animal)
 // println(cat is Dog)

// Não dá pra criar uma instância de 'Animal', mas
// da pra criar um váriavel do tipo, que armazena 'Cat' ou 'Dog'
    var animalCat: Animal = Cat("Cinza")
    var animalDog: Animal = Dog("Caramelo")

}