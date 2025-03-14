package fr.training.kotlin.basic.list

import fr.training.kotlin.basic.list.EmployeesUtilKt
import fr.training.kotlin.data.EmployeeFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmployeesUtilKtTest {

    private val employeesUtil = EmployeesUtilKt()

    @Test
    fun `Doit retourner la liste des matricules`() {
        val employees = EmployeeFactory.buildEmployeeDataset()

        val result = employeesUtil.listMatricule(employees)

        println(result)

        assertThat(result)
            .isNotNull
            .isNotEmpty
            .hasSize(employees.size)
            .containsExactlyInAnyOrderElementsOf(listOf("0005", "0003", "0006", "0002", "0001", "0004"))
    }

    @Test
    fun `Doit filtrer les employes superieurs au salaire passe en parametre`() {
        val employees = EmployeeFactory.buildEmployeeDataset()

        val result = employeesUtil.listGreaterThanSalary(employees, 60000)

        println(result)

        assertThat(result)
            .isNotNull
            .isNotEmpty
            .hasSize(3)
    }

    @Test
    fun `Doit regrouper les employes par salaire`() {
        val employees = EmployeeFactory.buildEmployeeDataset()

        val result = employeesUtil.groupBySalary(employees)

        println(result)

        assertThat(result)
            .isNotNull
            .isNotEmpty

        assertThat(result.keys).containsExactlyInAnyOrder(75_000, 60_000, 80_000, 55_000, 100_000)
    }

    @Test
    fun `Doit partitioner les employes par salaire`() {
        val employees = EmployeeFactory.buildEmployeeDataset()

        val result = employeesUtil.splitEmployeesBySalary(employees, 60000)

        println(result)

        assertThat(result)
            .isNotNull
            .isNotEmpty;

        result[true]?.forEach { assertThat(it.salaire).isGreaterThan(60000) }
        result[false]?.forEach { assertThat(it.salaire).isLessThanOrEqualTo(60000) }
    }

    @Test
    fun `Doit partitionner les employes par salaire et retourner leurs noms`() {
        val employees = EmployeeFactory.buildEmployeeDataset()

        val result = employeesUtil.splitEmployeesNameBySalary(employees, 60000)

        println(result)

        assertThat(result)
            .isNotNull
            .isNotEmpty

        val highSalaryNames = result[true]
        val highSalaries = listOf("Jean CLoud", "Neo", "Axo")
        assertThat(highSalaryNames).containsExactlyInAnyOrderElementsOf(highSalaries)

        val lowSalaryNames = result[false]
        val lowSalaries = listOf("Stack", "Ao", "Sed")
        assertThat(lowSalaryNames).containsExactlyInAnyOrderElementsOf(lowSalaries)
    }
}
