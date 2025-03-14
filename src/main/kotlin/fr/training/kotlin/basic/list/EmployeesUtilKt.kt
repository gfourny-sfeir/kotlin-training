package fr.training.kotlin.basic.list

/**
 * En s'appuyant sur les implémentations de [EmployeesUtilJava], implémenter leurs équivalences en Kotlin.
 *
 * Vous trouverez les opérations sur la [documentation de Kotlin](https://kotlinlang.org/docs/collections-overview.html)
 *
 * Tips :
 *   - Il n'y a pas besoin de déclarer des variables intermédiaires, utiliser les [opérations de collections (équivalent API Stream Java)](https://kotlinlang.org/docs/collection-operations.html)
 */
class EmployeesUtilKt {

    fun listMatricule(employees: List<Employee>): List<String> = employees.map(Employee::matricule)

    fun listGreaterThanSalary(employees: List<Employee>, minimumSalary: Int): List<Employee> = employees.filter { it.salaire > minimumSalary }

    fun groupBySalary(employees: List<Employee>): Map<Int, List<Employee>> = employees.groupBy(Employee::salaire)

    fun splitEmployeesBySalary(employees: List<Employee>, salary: Int): Map<Boolean, List<Employee>> = employees.groupBy { it.salaire > salary }

    /**
     * Pour plus de lisibilité, il est possible de nommer les arguments dans l'appel d'une fonction [Named Arguments](https://kotlinlang.org/docs/functions.html#named-arguments)
     */
    fun splitEmployeesNameBySalary(employees: List<Employee>, salary: Int): Map<Boolean, List<String>> = employees.groupBy(
        keySelector = { it.salaire > salary },
        valueTransform = (Employee::nom)
    )
}
