package org.example;

public class HybridCar extends Car {
    @Override
    public double calculateTaxes() {
        return 1.2*gramsCO2;
    }
}
