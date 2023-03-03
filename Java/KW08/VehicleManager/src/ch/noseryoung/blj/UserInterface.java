package ch.noseryoung.blj;

import Exceptions.DenylistedPersonException;
import Exceptions.LeaseLengthCollisionException;
import Exceptions.MinorAgeException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    public void UserInputHandler(ArrayList<Person> personList, ArrayList<Vehicle> vehicleList, VehicleRentalManager rentalManager) {
        int input = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("*****************************");
            System.out.println("   Vehicle Rental Manager    ");
            System.out.println("*****************************");
            System.out.println("1 - New Person");
            System.out.println("2 - New vehicle");
            System.out.println("3 - New contract");
            System.out.println("4 - Add person to deny list");
            System.out.println("5 - Quit");
            System.out.println("*****************************");

            input = scanner.nextInt();

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
                    scanner.nextLine();

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

                    try {
                        rentalManager.createContract(startDate, endDate, text, customer, rentedVehicle);
                    } catch (MinorAgeException e) {
                        System.out.println("The age restriction of this vehicle is too high for the age of the person.");
                    } catch (DenylistedPersonException e) {
                        System.out.println("This person is on the denylist ");
                    } catch (LeaseLengthCollisionException e) {
                        System.out.println("Another person rents the vehicle at this time.");
                    }
                }
            } else if (input == 4) {
                if (personList.isEmpty()) {
                    System.out.println("A person is missing to put on the denylist");
                } else {
                    System.out.println("Which person do you want to put on the denylist?");
                    for (int i = 0; i < personList.size(); i++) {
                        System.out.println(i + " - " + personList.get(i).getFirstName() + " " + personList.get(i).getLastName());
                    }
                    int personIndex = scanner.nextInt();
                    Person customer = personList.get(personIndex);
                    rentalManager.addPersonToDenyList(customer);
                }
            }
            if (input != 5) {
                System.out.println("Invalid input");
            }
        } while (input != 5);
    }
}
