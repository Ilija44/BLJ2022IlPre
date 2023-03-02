package ch.noseryoung.blj;

import Exceptions.DenylistedPersonException;
import Exceptions.LeaseLengthCollisionException;
import Exceptions.MinorAgeException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    public void UserInput( ArrayList<Person> personList,  ArrayList<Vehicle> vehicleList,  VehicleRentalManager rentalManager) throws MinorAgeException, DenylistedPersonException, LeaseLengthCollisionException {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Verhicle Rental Manager");
            System.out.println("************************");
            System.out.println("1 = new Person");
            System.out.println("2 = new vehicle");
            System.out.println("3 = new contract");
            System.out.println("************************");

            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("firstname:");
                String firstname = scanner.next();
                scanner.nextLine();
                System.out.println("lastname:");
                String lastname = scanner.next();
                System.out.println("Birthyear:");
                int birthyear = scanner.nextInt();
                System.out.println("Birthmonth:");
                int birthmonth = scanner.nextInt();
                System.out.println("Birthday:");
                int birthday = scanner.nextInt();
                Person person = new Person(firstname, lastname, LocalDate.of(birthyear, birthmonth, birthday));
                personList.add(person);
                rentalManager.setCustomerList(personList);
                System.out.println("The person " + person.getFirstName() + " is added to the list");

            } else if (input == 2) {
                System.out.println("Model: ");
                String model = scanner.next();
                System.out.println("Max speed: ");
                int maxSpeed = scanner.nextInt();
                System.out.println("Year: ");
                int year = scanner.nextInt();
                System.out.println("Serial number: ");
                int serialNumber = scanner.nextInt();
                System.out.println("Price: ");
                int price = scanner.nextInt();
                System.out.println("Person capacity");
                int personCapacity = scanner.nextInt();
                System.out.println("Age restriction of the vehicle: ");
                int ageRestriction = scanner.nextInt();
                Vehicle vehicle = new Vehicle(model, maxSpeed, year, serialNumber, price, personCapacity, ageRestriction);
                vehicleList.add(vehicle);
                rentalManager.setVehicles(vehicleList);
                System.out.println("The Vehicle " + vehicle.getModel() + " is added to the list");

            } else if (input == 3) {
                if (personList.isEmpty()) {
                    System.out.println("A person is missing to do a contract");
                } else if (vehicleList.isEmpty()) {
                    System.out.println("There is no vehicle to rent");
                } else {
                    System.out.println("Start date (format: yyyy-mm-dd): ");
                    String startDateString = scanner.next();
                    LocalDate startDate = LocalDate.parse(startDateString);
                    System.out.println("End date (format: yyyy-mm-dd): ");
                    String endDateString = scanner.next();
                    LocalDate endDate = LocalDate.parse(endDateString);
                    System.out.println("General remark: ");
                    String text = scanner.next();

                    System.out.println("Select a person from the list to rent the vehicle:");
                    for (int i = 0; i < personList.size(); i++) {
                        System.out.println(i + " - " + personList.get(i).getFirstName() + " " + personList.get(i).getLastName());
                    }
                    int personIndex = scanner.nextInt();
                    Person customer = personList.get(personIndex);

                    System.out.println("Select a vehicle from the list to rent:");
                    for (int i = 0; i < vehicleList.size(); i++) {
                        System.out.println(i + " - " + vehicleList.get(i).getModel());
                    }
                    int vehicleIndex = scanner.nextInt();
                    Vehicle rentedVehicle = vehicleList.get(vehicleIndex);

                    rentalManager.createContract(startDate, endDate, text, customer, rentedVehicle);
                }
            } else {
                System.out.println("Invalid input");
            }
        } while (true);
    }
}
