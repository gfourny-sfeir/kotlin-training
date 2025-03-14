package fr.training.kotlin.basic.list

/**
 * En s'appuyant sur les implémentations de [EmployeesUtilJava], implémenter leurs équivalences en Kotlin.
 *
 * Vous trouverez les opérations sur la [documentation de Kotlin](https://kotlinlang.org/docs/collections-overview.html)
 */
class EmployeesUtilKt {

    fun listMatricule(employees: List<Employee>): List<String> = employees.map(Employee::matricule)

    fun listGreaterThanSalary(employees: List<Employee>, minimumSalary: Int): List<Employee> = employees.filter { it.salaire > minimumSalary }

    fun groupBySalary(employees: List<Employee>): Map<Int, List<Employee>> = employees.groupBy(Employee::salaire)

    fun splitEmployeesBySalary(employees: List<Employee>, salary: Int): Map<Boolean, List<Employee>> = employees.groupBy { it.salaire > salary }

    fun splitEmployeesNameBySalary(employees: List<Employee>, salary: Int): Map<Boolean, List<String>> = employees.groupBy(
        keySelector = { it.salaire > salary },
        valueTransform = (Employee::nom)
    )
}
