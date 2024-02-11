package upCasting;

class Parent{
	String name;
	
	void greet() {
		System.out.println("Greeting from parent class. ");
	}
}
class Child extends Parent {
	int age;
	@Override
	void greet() {
		System.out.println("Greeting from child class. ");
	}
}

public class Main {

	public static void main(String[] args) {
		
		Parent parent = new Child();        // Upcasting
		
		parent.name = "Bob";
		System.out.println(parent.name);
		parent.greet();
		
		

	}

}
