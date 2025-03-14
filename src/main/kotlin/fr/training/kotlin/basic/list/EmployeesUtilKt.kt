package fr.training.kotlin.basic.list

/**
 * En s'appuyant sur les implémentations de [EmployeesUtilJava], implémenter leurs équivalences en Kotlin.
 *
 * Vous trouverez les opérations sur la [documentation de Kotlin](https://kotlinlang.org/docs/collections-overview.html)
 * Tips :
 *   - Il n'y a pas besoin de déclarer des variables intermédiaires, utiliser les [opérations de collections (équivalent API Stream Java)](https://kotlinlang.org/docs/collection-operations.html)
 */
class EmployeesUtilKt {

    fun listMatricule(employees: List<Employee>): List<String> = listOf()

    fun listGreaterThanSalary(employees: List<Employee>, minimumSalary: Int): List<Employee> = listOf()

    fun groupBySalary(employees: List<Employee>): Map<Int, List<Employee>> = mapOf()

    fun splitEmployeesBySalary(employees: List<Employee>, salary: Int): Map<Boolean, List<Employee>> = mapOf()

    /**
     * Pour plus de lisibilité, il est possible de nommer les arguments dans l'appel d'une fonction [Named Arguments](https://kotlinlang.org/docs/functions.html#named-arguments)
     */
    fun splitEmployeesNameBySalary(employees: List<Employee>, salary: Int): Map<Boolean, List<String>> = mapOf()
}
