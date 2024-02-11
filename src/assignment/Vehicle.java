package assignment;

public class Vehicle {

	String brands;
	String model;
	int year;
	
	public Vehicle(String brands, String model, int year) {
		this.brands = brands;
		this.model  =model;
		this.year = year;
	}
	
	
	
	void startEngine() {
		System.out.println("Engine started......");
	}
	public void display() {
		System.out.println("Brand is: " + brands);
		System.out.println("Model is: " +model);
		System.out.println("Product year: " + year);
	}
}
