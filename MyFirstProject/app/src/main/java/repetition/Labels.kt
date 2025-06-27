package repetition

fun main () {

    meuloop@ for (i in 'A'..'E') {
        for (j in 1..5) {
            print("$i$j ")

            if (j == 3){
                //break@meuloop
                continue@meuloop
            }
        }
        println()
    }
}