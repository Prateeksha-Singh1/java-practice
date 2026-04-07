// Abstraction
abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Fueling vehicle...");
    }
}

// Interface (Multiple Inheritance)
interface GPS {
    void navigate();
}

// Inheritance + Polymorphism + Encapsulation
class Car extends Vehicle implements GPS {

    // Encapsulation
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    // Method Overriding (Polymorphism)
    public void start() {
        System.out.println(brand + " car starts");
    }

    // Interface method
    public void navigate() {
        System.out.println("Navigation started");
    }
}

// Main class
public class OopsRevision {
    public static void main(String[] args) {

        Car c = new Car();

        c.setBrand("Toyota");   // Encapsulation
        c.start();              // Polymorphism
        c.fuel();               // Inheritance
        c.navigate();           // Interface

        System.out.println("Brand: " + c.getBrand());
    }
}