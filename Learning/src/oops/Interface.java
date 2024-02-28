package oops;

// Parent class
class Car {
    String brand;
    String model;

   Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void start() {
        System.out.println("Starting the " + brand + " " + model + ".");
    }

    public void stop() {
        System.out.println("Stopping the " + brand + " " + model + ".");
    }
}

// Child class inheriting from Car
class Sedan extends Car {
    int numOfSeats;

    public Sedan(String brand, String model, int numOfSeats) {
        super(brand, model);
        this.numOfSeats = numOfSeats;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Number of Seats: " + numOfSeats);
    }
}

// Child class inheriting from Car
class SUV extends Car {
    boolean fourWheelDrive;

    public SUV(String brand, String model) {
        super(brand, model);
        this.fourWheelDrive = fourWheelDrive;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
       }
}

public class Interface {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota", "Camry", 5);
        SUV suv = new SUV("Jeep", "Grand Cherokee");

        sedan.start();
        sedan.displayInfo();
        sedan.stop();

        System.out.println();

        suv.start();
        suv.displayInfo();
        suv.stop();
    }
}
