package Xperimentations;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int salary;
    private int rating;

    public Employee(String name, int salary, int rating) {
        this.name = name;
        this.salary = salary;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getRating() {
        return rating;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // toString method for easy display
    @Override
    public String toString() {
        return "{\"name\": \"" + name + "\", \"salary\": " + salary + ", \"rating\": " + rating + "}";
    }

    public static class SalaryHike {

            public static List<Employee> applySalaryHike(List<Employee> employees) {
                for (Employee emp : employees) {
                    double hikePercentage = 0.0;
                    switch (emp.getRating()) {
                        case 5:
                            hikePercentage = 0.20;
                            break;
                        case 4:
                            hikePercentage = 0.10;
                            break;
                        case 3:
                            hikePercentage = 0.05;
                            break;
                        default:
                            hikePercentage = 0.0;
                            break;
                    }

                    // Calculating new salary
                    double newSalary = emp.getSalary() * (1 + hikePercentage);
                    int roundedSalary = (int) Math.round(newSalary);
                    emp.setSalary(roundedSalary);

                    // Resetting the rating to zero
                    emp.setRating(0);
                }
                return employees;
            }

            public static void main(String[] args) {
                //given example input
                List<Employee> employees = new ArrayList<>();
                employees.add(new Employee("Charlie", 70000, 4));
                employees.add(new Employee("Alice", 50000, 5));
                employees.add(new Employee("Bob", 60000, 3));
                //Default salaries
                System.out.println(employees);

                // Applying salary hike
                List<Employee> updatedEmployees = applySalaryHike(employees);

                // Printing the updated list
                System.out.println(updatedEmployees);
            }
        }
}
