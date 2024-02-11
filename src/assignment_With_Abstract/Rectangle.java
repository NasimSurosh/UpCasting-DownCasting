package assignment_With_Abstract;

public class Rectangle extends Shape {

	double height;
	double width;

	Rectangle(String name, String color, double height, double width) {
		super(name, color);
		this.height = height;
		this.width = width;

	}

	@Override
	double calculateArea() {

		return height * width;
	}

}
