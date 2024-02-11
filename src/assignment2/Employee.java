package assignment2;

abstract class Employee {

	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;

	}

	abstract double calculateBonus();

}
