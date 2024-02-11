package downCasting;

;

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
		
		// Upcasting
		
		
		  Parent parent = new Child(); 
		  
		  parent.name = "Bob"; 
		  System.out.println(parent.name); parent.greet();
		 
		
		// Down casting
		
		Child child = (Child) parent;
		
		child.age = 32;
		System.out.println(child.name);
		System.out.println(child.age);
		
		
		

	}

}