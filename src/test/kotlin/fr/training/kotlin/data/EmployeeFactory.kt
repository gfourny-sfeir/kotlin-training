package fr.training.kotlin.data

import fr.training.kotlin.basic.list.Employee

object EmployeeFactory {

    fun buildEmployeeDataset(): List<Employee> {
        return listOf(
            Employee("Ao", "0005", 55_000),
            Employee("Stack", "0003", 60_000),
            Employee("Sed", "0006", 60_000),
            Employee("Neo", "0002", 75_000),
            Employee("Jean CLoud", "0001", 80_000),
            Employee("Axo", "0004", 100_000)
        )
    }
}
