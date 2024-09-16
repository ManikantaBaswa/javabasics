package com.assignment4;

public class Clerk extends Employee {
	int speed;
	int accuracy;
	boolean amountAdded = false;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public Clerk() {
		super();
	}

	public Clerk(String name, int employeeId, double salary, int speed, int accuracy) {
		super(name, employeeId, salary);
		this.speed = speed;
		this.accuracy = accuracy;
	}

	@Override
	public void setSalary(double salary) {
		if (speed > 70 && accuracy > 80 && !amountAdded) {
			salary = salary + 1000;
			amountAdded = true;
			System.out.println(salary);
		} else if (!amountAdded) {
			salary = salary;
			super.setSalary(salary);

		}

	}
}