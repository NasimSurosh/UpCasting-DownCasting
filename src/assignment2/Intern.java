package assignment2;

public class Intern extends Employee {
	String durationInWeeks;
	double bonus;

	Intern(String name, double salary, String durationInWeeks, double bonus) {
		super(name, salary);
		this.durationInWeeks = durationInWeeks;
		this.bonus = bonus;
	}

	@Override
	double calculateBonus() {

		return bonus + salary;
	}

}
