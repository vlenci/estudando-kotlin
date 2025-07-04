package projects.employeemanagment.model

import projects.employeemanagment.utils.Company

var id: Int = 1

abstract class Employee(
    private val name: String,
    private val cpf: String,
    private var baseSalary: Double,
) : NormalPerson() {

    val annualSalary: Double
        get() = baseSalary * 12


    private val idEmployee: Int = id

    init {
        require(baseSalary > 0)
        Company.hire(this)
        id++
    }

    open fun calculateBonus(percentual: Double) = baseSalary * (1.0 + percentual)

    open fun displayInformation() {
        println("Employee [$idEmployee] info:")
        print("Name: $name\n")
        print("CPF: $cpf\n")
        print("Base salary: $baseSalary\n")
        print("Annual salary: $annualSalary\n")

        // println("Bonus: ${calculateBonus()}")
    }
}