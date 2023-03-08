package ch.noseryoung.blj;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        VehicleRentalManager rentalManager = new VehicleRentalManager();
        ArrayList<Person> personList = new ArrayList<>();
        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        UserInterface userInterface = new UserInterface();
        userInterface.UserInputHandler(personList, vehicleList, rentalManager);
    }
}

