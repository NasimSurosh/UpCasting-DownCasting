package assignment_With_Abstract;

public class Main {

	public static void main(String[] args) {
		
		Shape circle = new Circle("circle", "red",5);
		Shape rectangle = new Rectangle("rectangle","Yellow", 7,8);
		Shape triangle = new Triangle("triangle", "blue", 9, 6);
		
		Shape shape1 = circle;
		Shape shape2 = rectangle;
		Shape shape3 = triangle;
		System.out.println(shape1.name+ " area " +shape1.calculateArea());
		System.out.println(shape2.name+ " area " + shape2.calculateArea());
		System.out.println(shape3.name+ " area "+ shape3.calculateArea());
		
		
		if(shape1 instanceof Circle) {
			Circle circle1 = (Circle) shape1;
			
			System.out.println("The radius of circle is: " + circle1.radius);
			
		}
		if(shape2 instanceof Rectangle) {
			Rectangle rec = (Rectangle) shape2;
			
			System.out.println("The height of rectangle is: " + rec.height + " width " + rec.width);
		}
		if(shape3 instanceof Triangle) {
			Triangle triang = (Triangle) shape3;
			System.out.println("The height of triangle is: " + triang.height+ " base " + triang.base);
		}

	}

}
