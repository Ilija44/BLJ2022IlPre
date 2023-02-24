package ch.noseryoung.blj;

import java.time.LocalDate;

public class Starter {
    public static void main(String[] args) {
        VehicleRentalManager rentalManager = new VehicleRentalManager();

        Person person1 = new Person("Noah", "Boah", LocalDate.of(1990, 10, 10));
        Person person2 = new Person("Henri", "Koch", LocalDate.of(1995, 5, 5));
        Vehicle car1 = new Vehicle("BMW X5", 250, 2019, 23452, 50000, 6);
        Vehicle car2 = new Vehicle("Audi A3", 300, 2022, 2986, 60000, 5);


        rentalManager.createContract(person1, car1, LocalDate.now(), LocalDate.now().plusDays(7), "Miete für eine Woche");
        rentalManager.createContract(person2, car1, LocalDate.now().plusDays(5), LocalDate.now().plusDays(12), "Miete für eine Woche");

        System.out.println(car1.getName());
        System.out.println(person1.getFirstName());
        System.out.println(car2.getName());
        System.out.println(person2.getFirstName());

    }
}

