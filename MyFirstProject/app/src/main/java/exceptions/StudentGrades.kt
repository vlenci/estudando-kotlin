package exceptions

fun main() {

    try {
    val avg = StudentGrades()
    avg.add(-3.0)
    avg.add(5.5)
    avg.add(12.0)

    println(avg.average())

    } catch (e: Exception) {
        println("Error: ${e.message}")
        e.printStackTrace()
    }
}

class StudentGrades {
    private var sum: Double = 0.0
    private var numberOfGrades: Int = 0

    fun add(grade: Double) : StudentGrades {
        if (grade !in 0.0..10.0) {
            throw IllegalArgumentException("Invalid grade")
        }
        sum += grade
        numberOfGrades++
        return this
    }

    fun average() : Double {
        return sum / numberOfGrades
    }
}