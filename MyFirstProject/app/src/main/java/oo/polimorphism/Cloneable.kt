package oo.polimorphism

fun main() {

    val tree = Tree("Green", 1.83)
    val treeCopy = tree.clone()

    println(tree)
    println(treeCopy)
    println(tree == treeCopy)
}

// Se eu vou implementar apenas os métodos -> Usar interface
// Se eu vou utilizar propriedades -> Usar classe mãe
interface Cloneable {
    fun clone(): Any
}

data class Tree(
    val color: String,
    val height: Double
) : Cloneable {

    override fun clone(): Any {
        return Tree(color, height)
    }
}