package projects.employeemanagment.interfaces

interface Authenticable {

    fun authenticate(senha: String): Boolean
}