package assignment_With_Abstract;

public class Circle extends Shape{
	
	double radius;
	Circle(String name, String color, int radius) {
		super(name, color);
		this.radius = radius;
		
		
	}
	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	

}
