package projects.employeemanagment.model

class Intern(
    val name: String,
    val cpf: String,
    var baseSalary: Double,
    var internshipHours: Int
) : Employee(name, cpf, baseSalary) {

    fun demonstrateHours() {
        println("Here is the amount of hours done: $internshipHours")
    }

    override fun displayInformation() {
        super.displayInformation()
        println("Role: Intern")
        println("----------------------------")
    }
}