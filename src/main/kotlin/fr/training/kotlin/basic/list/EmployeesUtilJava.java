package fr.training.kotlin.basic.list;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesUtilJava {

    public List<String> listMatricule(List<Employee> employees) {

        return employees.stream()
                .map(Employee::getMatricule)
                .toList();
    }

    public List<Employee> listGreaterThanSalary(List<Employee> employees, Integer minimumSalary) {

        return employees.stream()
                .filter(it -> it.getSalaire() > minimumSalary)
                .toList();
    }

    public Map<Integer, List<Employee>> groupBySalary(List<Employee> employees) {

        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getSalaire, Collectors.toUnmodifiableList()));
    }

    public Map<Boolean, List<Employee>> splitEmployeesBySalary(List<Employee> employees, int salary) {

        return employees.stream()
                .collect(Collectors.partitioningBy(it -> it.getSalaire() > salary, Collectors.toUnmodifiableList()));
    }

    public Map<Boolean, List<String>> splitEmployeesNameBySalary(List<Employee> employees, int salary) {

        return employees.stream()
                .collect(Collectors.partitioningBy(
                        it -> it.getSalaire() > salary,
                        Collectors.mapping(
                                Employee::getNom,
                                Collectors.toUnmodifiableList()
                        ))
                );
    }
}
