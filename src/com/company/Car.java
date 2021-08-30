package com.company;

public class Car {

    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels ;
    private int doors ;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels =4;
        this.engine = true;
        this.doors = 5;

    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String startEngine(){
        return "Car --> startengine()";
    }

    public String accelerate(){
        return "Car --> accelerate()";
    }

    public String brake(){
        return "Car -->  brake()";

    }
}
