package org.example;

public class Motorbike extends Vehicle {
    protected double engineDisplacement;

    @Override
    public double calculateTaxes() {
        return this.engineDisplacement*0.10;
    }
}
