package com.assignment4;

public class Manager extends Employee {
	private ManagerType type;

	public ManagerType getType() {
		return type;
	}

	public void setType(ManagerType type) {
		this.type = type;
	}

	public Manager(ManagerType type) {
		super();
		this.type = type;
	}

	public Manager(String name, int employeeId, double salary, ManagerType type) {
		super(name, employeeId, salary);
		this.type = type;
	}

	@Override
	public void setSalary(double salary) {
//		if (type.equals("Hr")) {
//
//			salary = +10000;
//		}
//		if (type.equals("sales")) {
//			salary = +5000;
//
//		}

		if (this.type == ManagerType.Hr) {
			super.setSalary(salary + 10000);
			

		} else if (this.type == ManagerType.sales) {
			super.setSalary(salary + 5000);
		} else {
			super.setSalary(salary);
		}
		System.out.println(salary);
	}

}
