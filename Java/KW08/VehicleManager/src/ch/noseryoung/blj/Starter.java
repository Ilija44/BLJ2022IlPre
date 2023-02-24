package ch.noseryoung.blj;

import Exceptions.DenylistedPersonException;
import Exceptions.LeaseLengthCollisionException;
import Exceptions.MinorAgeException;
import java.time.LocalDate;

public class Starter {
    public static void main(String[] args) throws MinorAgeException, DenylistedPersonException, LeaseLengthCollisionException {
        VehicleRentalManager rentalManager = new VehicleRentalManager();

        Person person1 = new Person("Noah", "Boah", LocalDate.of(2000, 10, 10));
        Person person2 = new Person("Henri", "Koch", LocalDate.of(1995, 5, 5));
        Vehicle car1 = new Vehicle("BMW X5", 250, 2019, 23452, 50000, 6);
        Vehicle car2 = new Vehicle("Audi Q7", 300, 2022, 2986, 60000, 5);

        rentalManager.addPersonToDenyList(person1);

        rentalManager.createContract(LocalDate.of(2020, 11, 21), LocalDate.of(2020, 11, 23), "h", person1, car1);
        rentalManager.createContract(LocalDate.of(2020, 11, 22), LocalDate.of(2020, 12, 22), "h", person2, car2);

        /**
         @author Noah
         */
    }
}

