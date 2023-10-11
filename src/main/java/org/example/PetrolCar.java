package org.example;

public class PetrolCar extends Car {
    @Override
    public double calculateTaxes() {
        return 1.4*gramsCO2;
    }
}
