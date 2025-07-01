package projects.employeemanagment.utils

import projects.employeemanagment.model.Employee


object Company {
    var employees = mutableListOf<Employee>()

    fun hire(newEmployee: Employee) {
        employees.add(newEmployee)
    }

    fun fire(oldEmployee: Employee) {
        employees.remove(oldEmployee)
    }

    fun showCompanyEmployees() {
        for (employee in employees) {
           employee.displayInformation()
        }
    }
}