package assignment2;

public class Main {

	public static void main(String[] args) {
		
		Employee manager = new Manager("Kawa", 4500.0, 22, 250);
		Employee engineer = new Engineer ("Raja", 4100, "Python", 150);
		Employee intern = new Intern("Radhi", 3000, "5 days per weeks", 140);
		
		
		Employee manager1 = manager;
		Employee engineer1 = engineer;
		Employee intern1 = intern;
		System.out.println("Name  is: " + manager1.name +" salary plus bonus of manager is " + manager1.calculateBonus());
		System.out.println("Name is: "+ engineer1.name + " salary plus bonus of engineer is " + engineer1.calculateBonus());
		System.out.println("name is:" + intern1.name +" salary plus bonus of intern is "+ intern1.calculateBonus());
		
		System.out.println();
		
		if(manager1 instanceof Manager) {
			Manager manage = (Manager) manager1;
			System.out.println("Manager team size is "+manage.teamSize);
			System.out.println("Manager bonus is "+manage.bonus);
		}
		System.out.println();
		if(engineer1 instanceof Engineer) {
			Engineer engen = (Engineer) engineer1;
			System.out.println("Engineer programming language is " + engen.programmingLanguage);
			System.out.println("Engineer bonus is " + engen.bonus);
		}
		System.out.println();
		if (intern1 instanceof Intern) {
			Intern inter = (Intern) intern1;
			System.out.println("Working hours of intern are " + inter.durationInWeeks);
			System.out.println("Intern bonus is " + inter.bonus);
		}

	}

}
