package projects.employeemanagment.model

class Developer(
    val name: String,
    val cpf: String,
    var baseSalary: Double,
    var progLang: String
) : Employee(name, cpf, baseSalary) {

    fun avaliateLanguage() {
        if (progLang == "Javascript") {
            println("$progLang is bad \uD83D\uDE21")
        } else {
            println("$progLang is good! :)")
        }
    }

    override fun displayInformation() {
        super.displayInformation()
        println("Role: Developer")
        println("----------------------------")
    }
}