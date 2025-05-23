package curriculum9;

public class Vehicle {
    String brand = "Ford";
}

class Car extends Vehicle {
    void drive() {
        System.out.println(brand + " is driving.");
    }
}

class Main {
    public static void main(String[] args)  {
        Car myCar = new Car();
        myCar.drive();
    }
}