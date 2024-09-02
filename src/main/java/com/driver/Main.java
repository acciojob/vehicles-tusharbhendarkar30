package com.driver;

public class Main {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle("Generic Vehicle");
        System.out.println("Vehicle Name: " + vehicle.getVehicleName());

        Car car = new Car("Family Car", 5);
        System.out.println("Car Name: " + car.getVehicleName());
        System.out.println("Car Capacity: " + car.getVehicleCapacity());

        F1 f1 = new F1("F1 Racing Car", 2);
        System.out.println("F1 Car Name: " + f1.getVehicleName());
        System.out.println("F1 Car Capacity: " + f1.getVehicleCapacity());

       
        Boat boat = new Boat("Speedy Boat", 10);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity());
    }
}
