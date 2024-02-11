package assignment2;

public class Engineer extends Employee {
	String programmingLanguage;
	double bonus;

	Engineer(String name, double salary, String programmingLanguage, double bonus) {
		super(name, salary);
		this.programmingLanguage = programmingLanguage;
		this.bonus = bonus;

	}

	@Override
	double calculateBonus() {
		// TODO Auto-generated method stub
		return bonus + salary;
	}

}
