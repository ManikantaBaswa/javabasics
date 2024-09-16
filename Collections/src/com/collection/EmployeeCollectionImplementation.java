package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeCollectionImplementation {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String departments;
	private int joining;
	private double salary;

	public EmployeeCollectionImplementation(int id, String name, int age, String gender, String departments,
			int joining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.departments = departments;
		this.joining = joining;
		this.salary = salary;
	}

	public EmployeeCollectionImplementation() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getdepartments() {
		return departments;
	}

	public void setdepartments(String departments) {
		this.departments = departments;
	}

	public int getJoining() {
		return joining;
	}

	public void setJoining(int joining) {
		this.joining = joining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		List<EmployeeCollectionImplementation> employees = new ArrayList<>();
		employees.add(new EmployeeCollectionImplementation(111, "Vishnu Priya", 32, "Female", "HR", 2011, 25000.0));
		employees.add(new EmployeeCollectionImplementation(122, "Vinay Raj", 25, "Male", "Sales And Marketing", 2015,
				13500.0));
		employees.add(new EmployeeCollectionImplementation(133, "Avinash Reddy", 29, "Male", "Infrastructure", 2012,
				18000.0));
		employees.add(new EmployeeCollectionImplementation(144, "Bhanu Prasad", 28, "Male", "Product Development", 2014,
				32500.0));
		employees.add(new EmployeeCollectionImplementation(155, "Aish Roy", 27, "Female", "HR", 2013, 22700.0));
		employees.add(new EmployeeCollectionImplementation(166, "Raj Vignesh", 43, "Male", "Security And Transport",
				2016, 10500.0));
		employees.add(new EmployeeCollectionImplementation(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010,
				27000.0));
		employees.add(new EmployeeCollectionImplementation(188, "Chandra Mouli", 31, "Male", "Product Development",
				2015, 34500.0));
		employees.add(new EmployeeCollectionImplementation(199, "Shilpa Shetty", 24, "Female", "Sales And Marketing",
				2016, 11500.0));
		employees.add(new EmployeeCollectionImplementation(200, "Kumar Raja", 38, "Male", "Security And Transport",
				2015, 11000.5));
		employees.add(
				new EmployeeCollectionImplementation(211, "Ameen Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employees.add(new EmployeeCollectionImplementation(222, "Sunil Joshi", 25, "Male", "Product Development", 2016,
				28200.0));
		employees.add(new EmployeeCollectionImplementation(233, "Jyothi Reddy", 27, "Female", "Account And Finance",
				2013, 21300.0));
		employees.add(new EmployeeCollectionImplementation(244, "Shankar Dada", 24, "Male", "Sales And Marketing", 2017,
				10700.5));
		employees.add(
				new EmployeeCollectionImplementation(255, "Alia Butt", 23, "Male", "Infrastructure", 2018, 12700.0));
		employees.add(new EmployeeCollectionImplementation(266, "Santhi Pandey", 26, "Female", "Product Development",
				2015, 28900.0));
		employees.add(new EmployeeCollectionImplementation(277, "Sunil Shetty", 31, "Male", "Product Development", 2012,
				35700.0));

		// 1 : How many male and female employees are there in the organization?
		int maleCount = 0;
		int femaleCount = 0;
		for (EmployeeCollectionImplementation emp : employees) {
			if (emp.getGender().equals("Male")) {
				maleCount++;
			} else if (emp.getGender().equals("Female")) {
				femaleCount++;
			}
		}
		System.out.println("Number of Male Employees are " + maleCount);
		System.out.println("Number of Female Employees are " + femaleCount);

		// 2:Print the name of all departments in the organization?

		for (EmployeeCollectionImplementation em : employees) {
			em.getdepartments();

			System.out.print(em.getdepartments());

		}
		System.out.println();

		// 3 : What is the average age of male and female employees?

		double maleAgeCounter = 0;
		double maleAgeCount = 0;
		double femaleAgeCounter = 0;
		double femaleAgeCount = 0;
		for (EmployeeCollectionImplementation gender : employees) {
			if (gender.getGender().equals("Male")) {
				maleAgeCounter += gender.getAge();

				maleAgeCount++;

			} else if (gender.getGender().equalsIgnoreCase("Female")) {
				femaleAgeCounter += gender.getAge();
				femaleAgeCount++;
			}

		}
		double averageOfMale = maleAgeCounter / maleAgeCount;
		double averageOfFemale = femaleAgeCounter / femaleAgeCount;
		System.out.println("Average age of Male is" + averageOfMale);
		System.out.println("Average age of Female is" + averageOfFemale);

		// 4.Get the details of highest paid employee in the organization?
		double highestSalary = 0;
		double highestPaid = 0;
		for (EmployeeCollectionImplementation e : employees) {

			if (e.getSalary() > highestSalary) {
				highestSalary = e.getSalary();
				highestPaid = highestSalary;
			}
		}
		System.out.println(highestPaid);

		// 5.Get the names of all employees who have joined after 2015?
		List<String> names = new ArrayList<String>();
		for (EmployeeCollectionImplementation e : employees) {
			if (e.getJoining() > 2015) {
				names.add(e.getName());
			}

		}
		for (String name : names) {
			System.out.println(name);
		}

		// 6.Count the number of employees in each department?
		Map<String, Integer> departmentCount = new HashMap<String, Integer>();
		for (EmployeeCollectionImplementation employee : employees) {
			String department = employee.getdepartments();
			if (departmentCount.containsKey(department)) {
				departmentCount.put(department, departmentCount.get(department) + 1);
			} else {
				departmentCount.put(department, 1);
			}
		}
		for (Map.Entry<String, Integer> entry : departmentCount.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// 7.What is the average salary of each department

		Map<String, Double> totalSalaryByDept = new HashMap<>();
		Map<String, Integer> countByDept = new HashMap<>();

		for (EmployeeCollectionImplementation employee : employees) {
			String department = employee.getdepartments();
			double salary = employee.getSalary();

			if (!totalSalaryByDept.containsKey(department)) {
				totalSalaryByDept.put(department, salary);
				countByDept.put(department, 1);
			} else {
				totalSalaryByDept.put(department, totalSalaryByDept.get(department) + salary);
				countByDept.put(department, countByDept.get(department) + 1);
			}
		}

		for (String department : totalSalaryByDept.keySet()) {
			double totalSalary = totalSalaryByDept.get(department);
			int count = countByDept.get(department);
			double averageSalary = totalSalary / count;
			System.out.println("Average salary of " + department + " department: " + averageSalary);
		}
		// 8. Get the details of youngest male employee in the product
		EmployeeCollectionImplementation youngestMaleProductEmployee = null;

		for (EmployeeCollectionImplementation employee : employees) {
			if (employee.getGender().equalsIgnoreCase("Male")
					&& employee.getdepartments().equalsIgnoreCase("Product")) {
				if (youngestMaleProductEmployee == null || employee.getAge() < youngestMaleProductEmployee.getAge()) {
					youngestMaleProductEmployee = employee;
				}
			}
		}

		if (youngestMaleProductEmployee != null) {
			System.out.println("Youngest male employee in Product department:");
			System.out.println("Name: " + youngestMaleProductEmployee.getName());
			System.out.println("Age: " + youngestMaleProductEmployee.getAge());
			System.out.println("Gender: " + youngestMaleProductEmployee.getGender());
			System.out.println("Department: " + youngestMaleProductEmployee.getdepartments());
		} else {
			System.out.println("No male employee found in the Product department.");
		}
		// 9.Who has the most working experience in the organization?
		EmployeeCollectionImplementation mostExperiencedEmployee = null;

		for (EmployeeCollectionImplementation employee : employees) {
			if (mostExperiencedEmployee == null || employee.getJoining() > mostExperiencedEmployee.getJoining()) {
				mostExperiencedEmployee = employee;
			}
		}

		if (mostExperiencedEmployee != null) {
			System.out.println("Employee with the most working experience:");
			System.out.println("Name: " + mostExperiencedEmployee.getName());
			System.out.println("Years of Experience: " + mostExperiencedEmployee.getJoining());
		} else {
			System.out.println("No employees found in the organization.");
		}
		// 10.How many male and female employees are there in the sales
		int maleCount1 = 0;
		int femaleCount1 = 0;

		for (EmployeeCollectionImplementation employee : employees) {
			if (employee.getdepartments().equalsIgnoreCase("Sales")) {
				if (employee.getGender().equalsIgnoreCase("Male")) {
					maleCount1++;
				} else if (employee.getGender().equalsIgnoreCase("Female")) {
					femaleCount1++;
				}
			}
		}

		System.out.println("Number of male employees in Sales department: " + maleCount1);
		System.out.println("Number of female employees in Sales department: " + femaleCount1);

		// 11.What is the average salary of male and female employees?

		double totalMaleSalary = 0;
		int maleCount2 = 0;
		double totalFemaleSalary = 0;
		int femaleCount2 = 0;
		for (EmployeeCollectionImplementation employee : employees) {
			if (employee.getGender().equalsIgnoreCase("Male")) {
				totalMaleSalary += employee.getSalary();
				maleCount++;
			} else if (employee.getGender().equalsIgnoreCase("Female")) {
				totalFemaleSalary += employee.getSalary();
				femaleCount++;
			}
		}

		double averageMaleSalary = maleCount2 > 0 ? totalMaleSalary / maleCount2 : 0;
		double averageFemaleSalary = femaleCount > 0 ? totalFemaleSalary / femaleCount2 : 0;

		System.out.println("Average salary of male employees: " + averageMaleSalary);
		System.out.println("Average salary of female employees: " + averageFemaleSalary);

		// 12.List down the names of all employees in each department?
		Map<String, List<String>> departmentEmployees = new HashMap<>();

		for (EmployeeCollectionImplementation employee : employees) {
			String department = employee.getdepartments();
			String name = employee.getName();

			if (!departmentEmployees.containsKey(department)) {
				departmentEmployees.put(department, new ArrayList<>());
			}

			departmentEmployees.get(department).add(name);
		}

		for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
			String department = entry.getKey();
			List<String> namesList = entry.getValue();

			System.out.println("Department: " + department);
			for (String name : namesList) {
				System.out.println(" - " + name);
			}
		}
		// 13.What is the average salary and total salary of the whole
		double totalSalary = 0;
		int employeeCount = 0;

		for (EmployeeCollectionImplementation employee : employees) {
			totalSalary += employee.getSalary();
			employeeCount++;
		}

		double averageSalary = employeeCount > 0 ? totalSalary / employeeCount : 0;

		System.out.println("Total salary of all employees: " + totalSalary);
		System.out.println("Average salary of all employees: " + averageSalary);

		// 14. Separate the employees who are younger or equal to 25 years
		List<EmployeeCollectionImplementation> youngerOrEqualTo25 = new ArrayList<>();
		List<EmployeeCollectionImplementation> olderThan25 = new ArrayList<>();

		for (EmployeeCollectionImplementation employee : employees) {
			if (employee.getAge() <= 25) {
				youngerOrEqualTo25.add(employee);
			} else {
				olderThan25.add(employee);
			}
		}

		System.out.println("Employees younger or equal to 25 years:");
		for (EmployeeCollectionImplementation employee : youngerOrEqualTo25) {
			System.out.println(
					"Name: " + employee.getName() + ", Age: " + employee.getAge() + ", Salary: " + employee.getSalary()
							+ ", Gender: " + employee.getGender() + ", Department: " + employee.getdepartments());
		}
//15.Who is the oldest employee in the organization? What is his age and which department he belongs 

		EmployeeCollectionImplementation oldestEmployee = null;

		for (EmployeeCollectionImplementation employee : employees) {
			if (oldestEmployee == null || employee.getAge() > oldestEmployee.getAge()) {
				oldestEmployee = employee;
			}
		}

		if (oldestEmployee != null) {
			System.out.println("Oldest employee:");
			System.out.println("Name: " + oldestEmployee.getName());
			System.out.println("Age: " + oldestEmployee.getAge());
			System.out.println("Department: " + oldestEmployee.getdepartments());
		} else {
			System.out.println("No employees found.");
		}
	}
}
