package com.company;

public class mercedes extends Car{


    public mercedes(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mercedes --> startengine()";
    }

    @Override
    public String accelerate() {
        return "Mercedes --> accelerate()";
    }

    @Override
    public String brake() {
        return "Mercedes --> brake()";
    }
}
