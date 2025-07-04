package projects.employeemanagment

import projects.employeemanagment.interfaces.Authenticable
import projects.employeemanagment.model.Developer
import projects.employeemanagment.model.Employee
import projects.employeemanagment.model.Intern
import projects.employeemanagment.model.Manager
import projects.employeemanagment.utils.Company

fun main() {

    val d1 = Developer("Vitor", "163.444.112-72", 8450.50, "Kotlin")
    val d2 = Developer("Gabriel", "163.444.112-72", 8450.50, "Javascript")

    d2.avaliateLanguage()

    val m1 = Manager("Lenci", "777.333.444-00", 12500.00)
    m1.addManaged(d1)
    m1.addManaged(d2)
    m1.showManaged()
    println("$$$$$$$$$$$$$$$$$$")

    val i1 = Intern("Jose", "103.436.189-77", 1800.0, 30)


    Company.showCompanyEmployees()
    println("******************")
    Company.fire(d1)
    Company.showCompanyEmployees()
    println("##################")

    val login = object : Authenticable {
        override fun authenticate(senha: String): Boolean {
            if (senha != "1234") {
                return true
            } else {
                return false
            }
        }
    }
    println(login.authenticate("1235"))
}