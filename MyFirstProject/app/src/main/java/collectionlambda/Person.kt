package collectionlambda

data class Person(val name: String, val age: Int) {

    companion object {
        fun data(): List<Person> {
            return listOf(
                Person("Pedro" ,13),
                Person("Vanessa" ,21),
                Person("João" ,32),
                Person("Joel" ,40),
                Person("Santana" ,60),
                Person("Neymar" ,23),
                Person("Ronaldo" ,40),
                Person("Ronaldinho" ,42),
                Person("Rivaldo" ,55),
            )
        }
    }
}