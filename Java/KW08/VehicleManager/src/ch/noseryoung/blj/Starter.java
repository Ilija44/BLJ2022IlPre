package ch.noseryoung.blj;

import Exceptions.DenylistedPersonException;
import Exceptions.LeaseLengthCollisionException;
import Exceptions.MinorAgeException;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) throws MinorAgeException, DenylistedPersonException, LeaseLengthCollisionException {
        VehicleRentalManager rentalManager = new VehicleRentalManager();
        ArrayList<Person> personList = new ArrayList<>();
        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        UserInterface userInterface = new UserInterface();
        userInterface.UserInput(personList, vehicleList, rentalManager);
    }
}

