package assignment_With_Abstract;

abstract class Shape {
	
	String name;
	String color;
	
	Shape(String name, String color) {
		this.name = name;
		this.color = color;
	}
	abstract double calculateArea();
public void display() {
	System.out.println(name + "color is " + color);
}

	
}
