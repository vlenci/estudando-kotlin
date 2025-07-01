package projects.employeemanagment.model

class Manager(
    val name: String,
    val cpf: String,
    var baseSalary: Double
) : Employee(name, cpf, baseSalary) {

    var managedEmployees = mutableListOf<Employee>()

    fun addManaged(employee: Employee) {
        managedEmployees.add(employee)
    }

    fun removeManaged(employee: Employee) {
        managedEmployees.remove(employee)
    }

    fun showManaged() {
        println("$name managed employees: ")
        for (employee in managedEmployees) {
            employee.displayInformation()
        }
    }

    override fun displayInformation() {
        super.displayInformation()
        println("Role: Manager")
        println("----------------------------")
    }
}