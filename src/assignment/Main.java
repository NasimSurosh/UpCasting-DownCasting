package assignment;


public class Main {

	public static void main(String[] args) {
		System.out.println("Car Upcasting");
		Vehicle car = new Car("BMW", "BMW LS", 2019);
		car.display();
		car.startEngine();
		
		System.out.println();
		System.out.println("Car Downcasting");
		
		Car car1 = (Car) car;
		car1.numberOfDoors = "4 Doors";	
		System.out.println("Car has: " + car1.numberOfDoors);
		
		
		System.out.println();
		System.out.println("Motorcycle Upcasting");
		
		Vehicle motor = new Motorcycle("Hyndai", "Hundai Takya",2019);
		motor.display();
		motor.startEngine();
		
		System.out.println();
		System.out.println("Motorcycle downcasting");	
		
		Motorcycle mo = (Motorcycle)motor;
		mo.engineRiplacement = "2 years";
		
		System.out.println("Motorcycle engine replacemnt: "+ mo.engineRiplacement);
		

	}

}
