package com.driver;

class Car extends Vehicle {
    int capacity;

    public Car(String name, int capacity) {
        super(name);  // Call to Vehicle constructor
        this.capacity = capacity;
    }

    public int getVehicleCapacity() {
        return capacity;
    }
}

