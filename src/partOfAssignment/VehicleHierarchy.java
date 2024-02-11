package partOfAssignment;

class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println(brand + " " + model + " (Year: " + year + ") is starting.");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }
}

class Motorcycle extends Vehicle {
    int engineDisplacement;

    public Motorcycle(String brand, String model, int year, int engineDisplacement) {
        super(brand, model, year);
        this.engineDisplacement = engineDisplacement;
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {

        // Create a Car and a Motorcycle
        Car car = new Car("Toyota", "Camry", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021, 500);

        // Upcasting to Vehicle references
        Vehicle vehicle1 = car;
        Vehicle vehicle2 = motorcycle;

        // Access common behavior using upcasted references
        vehicle1.startEngine();
        vehicle2.startEngine();

        // Downcasting to access specific attributes
        if (vehicle1 instanceof Car) {
            Car downcastedCar = (Car) vehicle1;
            System.out.println("Car Number of Doors: " + downcastedCar.numberOfDoors);
        }

        if (vehicle2 instanceof Motorcycle) {
            Motorcycle downcastedMotorcycle = (Motorcycle) vehicle2;
            System.out.println("Motorcycle Engine Displacement: " + downcastedMotorcycle.engineDisplacement + "cc");
        }
    }
}
