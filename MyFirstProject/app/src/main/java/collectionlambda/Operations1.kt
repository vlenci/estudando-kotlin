package collectionlambda

fun main() {

    val people = Person.data()
    val people2 = people.filter { it.age < 18 }
    println(people2)

    Person.data().filter { it.name == "Neymar" }.forEach { println(it) }
}