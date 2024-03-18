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
class Nissan extends Car {
    int numOfSeats;

    public Nissan(String brand, String model, int numOfSeats) {
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
class Kia extends Car {
    boolean fourWheelDrive;

    public Kia(String brand, String model) {
        super(brand, model);
      }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
       }
}

public class Interface {
    public static void main(String[] args) {
    	Nissan Nissan = new Nissan("Nissan", "GT-R", 5);
    	Kia Kia = new Kia("KIA", "K5");

        Nissan.start();
        Nissan.displayInfo();
        Nissan.stop();

        System.out.println();

        Kia.start();
        Kia.displayInfo();
        Kia.stop();
    }

}