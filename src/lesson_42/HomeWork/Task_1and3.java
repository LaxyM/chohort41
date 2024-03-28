package lesson_42.HomeWork;

import lesson_42.Theory.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Task_1and3 {
    public static void main(String[] args) {
    employList();
    }

    private static void employList() {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("John", 3000, 30, "Senior Developer", "IT"),
                new Employee("Emily", 2800, 28, "Data Analyst", "Analytics"),
                new Employee("Alex", 3200, 35, "Marketing Manager", "Marketing"),
                new Employee("Sophia", 2600, 26, "UX Designer", "Design"),
                new Employee("David", 3500, 32, "Financial Analyst", "Finance"),
                new Employee("Olivia", 2700, 27, "Project Manager", "Project Management"),
                new Employee("Nicholas", 2900, 29, "Sales Executive", "Sales"),
                new Employee("Samantha", 3100, 31, "Human Resources Specialist", "HR"),
                new Employee("Andrew", 3400, 34, "Quality Assurance Engineer", "Quality Assurance"),
                new Employee("Emma", 2550, 24, "Content Writer", "Content")
        ));

        /* Task 1:
        Дан список сотрудников (Employee) с полями name, department, salary.
        Используя Stream API, сгруппируйте сотрудников по отделам
         */

        Map<String, List<Employee>> employByDepart = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("getDepartment: " + employByDepart);




        /* Task 3:
        Дан список Employee.
        Вычислите среднюю зарплату сотрудников в каждом отделе и найдите отдел с максимальной средней зарплатой.
         */

        // Вычисление средней зарплаты сотрудников в каждом отделе
        Map<String, Double> avgSolByDep = employees
                .stream()
                .peek(System.out::println)
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        // Нахождение отдела с максимальной средней зарплатой
        Optional<Map.Entry<String, Double>> maxAvgSolByDep = avgSolByDep
                .entrySet()
                .stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue));


        maxAvgSolByDep.ifPresent(entry -> {
            System.out.println("\nОтдел с максимальной средней зарплатой: " + entry.getKey());
            System.out.println("Средняя зарплата: " + entry.getValue());
        });
    }


}//end
