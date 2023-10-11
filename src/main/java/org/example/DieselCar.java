package org.example;

public class DieselCar extends Car {
    @Override
    public double calculateTaxes() {
        return 1.8*gramsCO2;
    }
}
