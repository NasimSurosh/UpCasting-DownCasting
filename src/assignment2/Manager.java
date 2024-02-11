package assignment2;

public class Manager extends Employee {
	int teamSize;
	double bonus;

	Manager(String name, double salary, int teamSize, double bonus) {
		super(name, salary);
		this.teamSize = teamSize;
		this.bonus = bonus;
	}

	@Override
	double calculateBonus() {
		return bonus + salary;
	}

}
