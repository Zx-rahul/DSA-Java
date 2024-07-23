package FunctionalProgramming;

import java.util.Comparator;
import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees=List.of(
        new Employee("prashant",200),
        new Employee("sanchit",20),
        new Employee("ram",500),
        new Employee("prabash",90)
        );
        employees.stream()
//              .sorted((emp1,emp2)->emp1.getSalary()-emp2.getSalary())
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .forEach(System.out::println);
    }
}
