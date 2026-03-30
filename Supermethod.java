class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting");
    }

    void show() {
        start();
        super.start();
    }
}
public class Supermethod{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.show();
    }
}

