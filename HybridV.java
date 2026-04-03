interface Engine {
    void start();
}

interface GPS {
    void navigate();
}

class Vehicle {
    void fuel() {
        System.out.println("Vehicle uses fuel");
    }
}

class Car extends Vehicle implements Engine, GPS {

    public void start() {
        System.out.println("Engine started");
    }

    public void navigate() {
        System.out.println("Navigation started");
    }
}

public class HybridV {
    public static void main(String[] args) {
        Car c = new Car();
        c.fuel();
        c.start();
        c.navigate();
    }
}