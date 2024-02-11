package assignment_With_Abstract;

public class Triangle extends Shape {
	double height;
	double base;

	Triangle(String name, String color, double height, double base) {
		super(name, color);
		this.height = height;
		this.base = base;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return (height * base) / 2;
	}

}
