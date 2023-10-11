package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
       Main m = new Main();
       m.run();
    }

    public Main() {
        Motorbike b1 = new Motorbike();
        b1.setMaker("Yamaha");
        b1.setModel("250");
        b1.engineDisplacement = 250;
        b1.plateNumber = "1234A";

        Motorbike b2 = new Motorbike();
        b2.setMaker("Yamaha");
        b2.setModel("250");
        b2.engineDisplacement = 250;
        b2.plateNumber = "5678A";

        taxSystem.addVehicle(b1);
        taxSystem.addVehicle(b2);
    }

    private TaxSystem taxSystem = new TaxSystem();
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private boolean end = false;
    public void run() {

        removeVehicle();

        boolean end = false;
        while(!end) {
            menu();
        }
    }

    public void menu() {
        System.out.println("MENU");
        System.out.println("----");
        System.out.println("1. Add Vehicle");
        System.out.println("2. Remove Vehicle");
        System.out.println("3. Edit Vehicle");
        System.out.println("4. Search Vehicle");
        System.out.println("5. Add Person");
        System.out.println("6. Remove Person");
        System.out.println("7. Edit Person");
        System.out.println("8. Search Person");
        System.out.println("9. Transfer Vehicle");
        System.out.println("0. Exit");
        String str="";
        try {
            str = reader.readLine();
        } catch(Exception e) {
            System.out.println("Error reading the line");
        }
        switch(str) {
            case "1": addVehicle(); break;
            case "2": removeVehicle(); break;
            case "3": editVehicle(); break;
            case "4": searchVehicle(); break;
            case "5": addPerson(); break;
            case "6": removePerson(); break;
            case "7": editPerson(); break;
            case "8": searchPerson(); break;
            case "9": transferVehicle(); break;
            case "0": end=true; break;
            default:

        }

    }

    public void addVehicle() {

    }

    public void removeVehicle() {
        System.out.println("Plate number?");
        String plate = "";
        try {
            plate = reader.readLine();
        } catch (Exception e) {
            System.out.println("Error reading line");
        }

        Vehicle v = taxSystem.searchVehicle(plate);
        if(v==null) {
            System.out.println("No vehicle has been found");
        } else {
            taxSystem.removeVehicle(v);
        }
    }

    public void editVehicle() {

    }

    public void searchVehicle() {

    }

    public void addPerson() {

    }

    public void removePerson() {

    }

    public void editPerson() {

    }

    public void searchPerson() {

    }

    public void transferVehicle() {

    }

}