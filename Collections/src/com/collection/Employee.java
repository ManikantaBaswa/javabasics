package com.collection;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int yearJoined;
    private double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearJoined, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearJoined = yearJoined;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getDepartment() { return department; }
    public int getYearJoined() { return yearJoined; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', age=" + age + ", gender='" + gender + "', department='" + department + "', yearJoined=" + yearJoined + ", salary=" + salary + '}';
    }


    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(111, "Vishnu Priya", 32, "Female", "HR", 2011, 25000.0),
            new Employee(122, "Vinay Raj", 25, "Male", "Sales And Marketing", 2015, 13500.0),
            new Employee(133, "Avinash Reddy", 29, "Male", "Infrastructure", 2012, 18000.0),
            new Employee(144, "Bhanu Prasad", 28, "Male", "Product Development", 2014, 32500.0),
            new Employee(155, "Aish Roy", 27, "Female", "HR", 2013, 22700.0),
            new Employee(166, "Raj Vignesh", 43, "Male", "Security And Transport", 2016, 10500.0),
            new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0),
            new Employee(188, "Chandra Mouli", 31, "Male", "Product Development", 2015, 34500.0),
            new Employee(199, "Shilpa Shetty", 24, "Female", "Sales And Marketing", 2016, 11500.0),
            new Employee(200, "Kumar Raja", 38, "Male", "Security And Transport", 2015, 11000.5),
            new Employee(211, "Ameen Kaur", 27, "Female", "Infrastructure", 2014, 15700.0),
            new Employee(222, "Sunil Joshi", 25, "Male", "Product Development", 2016, 28200.0),
            new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0),
            new Employee(244, "Shankar Dada", 24, "Male", "Sales And Marketing", 2017, 10700.5),
            new Employee(255, "Alia Butt", 23, "Male", "Infrastructure", 2018, 12700.0),
            new Employee(266, "Santhi Pandey", 26, "Female", "Product Development", 2015, 28900.0),
            new Employee(277, "Sunil Shetty", 31, "Male", "Product Development", 2012, 35700.0)
        );

        // 1. How many male and female employees are there in the organization?
        long maleCount = employees.stream()
            .filter(e -> e.getGender().equalsIgnoreCase("Male"))
            .count();

        long femaleCount = employees.stream()
            .filter(e -> e.getGender().equalsIgnoreCase("Female"))
            .count();

        System.out.println("Male employees: " + maleCount);
        System.out.println("Female employees: " + femaleCount);

        // 2. Print the name of all departments in the organization
        List<String> departments = employees.stream()
            .map(Employee::getDepartment)
            .distinct()
            .collect(Collectors.toList());

        System.out.println("Departments: " + departments);

        // 3. What is the average age of male and female employees?
        OptionalDouble averageAgeMale = employees.stream()
            .filter(e -> e.getGender().equalsIgnoreCase("Male"))
            .mapToInt(Employee::getAge)
            .average();

        OptionalDouble averageAgeFemale = employees.stream()
            .filter(e -> e.getGender().equalsIgnoreCase("Female"))
            .mapToInt(Employee::getAge)
            .average();

        System.out.println("Average age of male employees: " + (averageAgeMale.isPresent() ? averageAgeMale.getAsDouble() : 0));
        System.out.println("Average age of female employees: " + (averageAgeFemale.isPresent() ? averageAgeFemale.getAsDouble() : 0));

        // 4. Get the details of highest paid employee in the organization
        Optional<Employee> highestPaidEmployee = employees.stream()
            .max(Comparator.comparingDouble(Employee::getSalary));

        highestPaidEmployee.ifPresent(employee -> {
            System.out.println("Highest paid employee: " + employee);
        });

        // 5. Get the names of all employees who have joined after 2015
        List<String> employeesJoinedAfter2015 = employees.stream()
            .filter(e -> e.getYearJoined() > 2015)
            .map(Employee::getName)
            .collect(Collectors.toList());

        System.out.println("Employees who joined after 2015: " + employeesJoinedAfter2015);

        // 6. Count the number of employees in each department
        Map<String, Long> employeesInEachDepartment = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println("Number of employees in each department: " + employeesInEachDepartment);

        // 7. What is the average salary of each department?
        Map<String, Double> averageSalaryByDepartment = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average salary of each department: " + averageSalaryByDepartment);

        // 8. Get the details of youngest male employee in the product development department
        Optional<Employee> youngestMaleInProductDev = employees.stream()
            .filter(e -> e.getGender().equalsIgnoreCase("Male"))
            .filter(e -> e.getDepartment().equalsIgnoreCase("Product Development"))
            .min(Comparator.comparingInt(Employee::getAge));

        youngestMaleInProductDev.ifPresent(employee -> {
            System.out.println("Youngest male employee in Product Development: " + employee);
        });

        // 9. Who has the most working experience in the organization?
        Optional<Employee> mostExperiencedEmployee = employees.stream()
            .min(Comparator.comparingInt(Employee::getYearJoined));

        mostExperiencedEmployee.ifPresent(employee -> {
            System.out.println("Employee with the most working experience: " + employee);
        });

        // 10. How many male and female employees are there in the Sales and Marketing department?
        long maleInSalesMarketing = employees.stream()
            .filter(e -> e.getDepartment().equalsIgnoreCase("Sales And Marketing"))
            .filter(e -> e.getGender().equalsIgnoreCase("Male"))
            .count();

        long femaleInSalesMarketing = employees.stream()
            .filter(e -> e.getDepartment().equalsIgnoreCase("Sales And Marketing"))
            .filter(e -> e.getGender().equalsIgnoreCase("Female"))
            .count();

        System.out.println("Male employees in Sales and Marketing: " + maleInSalesMarketing);
        System.out.println("Female employees in Sales and Marketing: " + femaleInSalesMarketing);

        // 11. What is the average salary of male and female employees?
        OptionalDouble averageSalaryMale = employees.stream()
            .filter(e -> e.getGender().equalsIgnoreCase("Male"))
            .mapToDouble(Employee::getSalary)
            .average();

        OptionalDouble averageSalaryFemale = employees.stream()
            .filter(e -> e.getGender().equalsIgnoreCase("Female"))
            .mapToDouble(Employee::getSalary)
            .average();

        System.out.println("Average salary of male employees: " + (averageSalaryMale.isPresent() ? averageSalaryMale.getAsDouble() : 0));
        System.out.println("Average salary of female employees: " + (averageSalaryFemale.isPresent() ? averageSalaryFemale.getAsDouble() : 0));

        // 12. List down the names of all employees in each department
        Map<String, List<String>> employeesByDepartment = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println("Employees in each department: " + employeesByDepartment);

        // 13. What is the average salary and total salary of the whole organization?
        double totalSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .sum();

        OptionalDouble averageSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .average();

        System.out.println("Total salary of the organization: " + totalSalary);
        System.out.println("Average salary of the organization: " + (averageSalary.isPresent() ? averageSalary.getAsDouble() : 0));

        // 14. Separate the employees who are younger or equal to 25 years
        Map<Boolean, List<Employee>> partitionedByAge = employees.stream()
            .collect(Collectors.partitioningBy(e -> e.getAge() <= 25));

        System.out.println("Employees aged 25 or younger: " + partitionedByAge.get(true));
        System.out.println("Employees older than 25: " + partitionedByAge.get(false));

        // 15. Who is the oldest employee in the organization? What is his age and which department does he belong to?
        Optional<Employee> oldestEmployee = employees.stream()
            .max(Comparator.comparingInt(Employee::getAge));

        oldestEmployee.ifPresent(employee -> {
            System.out.println("Oldest employee: " + employee);
        });
    }
    }
