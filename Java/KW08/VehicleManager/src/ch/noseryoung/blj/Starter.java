package ch.noseryoung.blj;

import Exceptions.DenylistedPersonException;
import Exceptions.LeaseLengthCollisionException;
import Exceptions.MinorAgeException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) throws MinorAgeException, DenylistedPersonException, LeaseLengthCollisionException {
        VehicleRentalManager rentalManager = new VehicleRentalManager();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<>();
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        do {
            System.out.println("Verhicle Rental Manager");
            System.out.println("************************");
            System.out.println("1 = new Person");
            System.out.println("2 = new car");
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
                    System.out.println("There is no Car to rent");
                } else {
                    System.out.println("Start date (format: yyyy-mm-dd): ");
                    String startDateString = scanner.next();
                    LocalDate startDate = LocalDate.parse(startDateString);
                    System.out.println("End date (format: yyyy-mm-dd): ");
                    String endDateString = scanner.next();
                    LocalDate endDate = LocalDate.parse(endDateString);
                    System.out.println("General remark: ");
                    String text = scanner.next();

                    ArrayList<>
                    rentalManager.createContract();

                }
            } else {
                System.out.println("Invalid input");
            }
        } while (true);

        //rentalManager.createContract(LocalDate.of(2020, 11, 22), LocalDate.of(2020, 12, 22), "Bemerkung", person2, car1);
    }
}

