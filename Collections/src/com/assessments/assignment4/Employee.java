package com.assignment4;

public class Employee {

	public static void main(String[] args) {
		
	//Manager hr
	Manager hrm=new Manager("Mani",1000,1524, ManagerType.Hr);
	hrm.setSalary(hrm.getSalary());
	System.out.println(hrm.getSalary());
	
	//Manager sales
	Manager salesm=new Manager("Mani",1000,1524, ManagerType.sales);
	salesm.setSalary(salesm.getSalary());
	System.out.println(salesm.getSalary());
	
	//Clerk
	Clerk c=new Clerk("Ravi", 435, 2345.6, 80, 90);

System.out.println(c.getSalary());
System.out.println(c.getSpeed());
System.out.println(c.getAccuracy());
c.setSpeed(85);
c.setAccuracy(96);
c.setSalary(c.getSalary());
System.out.println(c.getSalary());
	}

	public enum ManagerType {
		Hr, sales;

	}

	private String name;
	private int employeeId;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public Employee(String name, int employeeId, double salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}

}
