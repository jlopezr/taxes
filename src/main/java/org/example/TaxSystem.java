package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaxSystem {
    protected List<Person> people;
    protected List<Vehicle> vehicles;

    public TaxSystem() {
        people = new ArrayList<>();
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public boolean removeVehicle(Vehicle v) {
        return vehicles.remove(v);
    }

    public void editVehicle() {

    }

    public Vehicle searchVehicle(String plateNumber) {
        for(Vehicle v : vehicles) {
            if(v.getPlateNumber().equals(plateNumber)) {
                return v;
            }
        }
        return null;
    }

    public void addPerson() {

    }

    public void removePerson() {

    }

    public void editPerson() {

    }

    public void searchPerson() {

    }


}
