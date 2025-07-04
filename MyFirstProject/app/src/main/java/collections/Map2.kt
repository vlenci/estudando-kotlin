package collections

fun main() {

    val map = mapOf(1 to "A", 2 to "B", 3 to "C")


    // Duas formas de fazer a mesma coisa
    map.forEach {
        println("${it.key} ==> ${it.value}")
    }

    map.forEach { (k, v) ->
        println("$k --> $v")
    }
    // -----------------------------------

    map.keys.forEach { println(it) }

    map.values.forEach { println(it) }
}