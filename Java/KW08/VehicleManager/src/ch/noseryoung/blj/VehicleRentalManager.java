package ch.noseryoung.blj;

import Exceptions.DenylistedPersonException;
import Exceptions.LeaseLengthCollisionException;
import Exceptions.MinorAgeException;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class VehicleRentalManager {

    private ArrayList<Person> customerList = new ArrayList<>();

    private ArrayList<Person> denyList = new ArrayList<>();

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    private ArrayList<Contract> contracts = new ArrayList<>();


    public void createContract(LocalDate startDate, LocalDate endDate, String text, Person person, Vehicle vehicle)
            throws MinorAgeException, DenylistedPersonException, LeaseLengthCollisionException {

        Contract con = new Contract(startDate, endDate, text, person, vehicle);

        LocalDate currentDate = LocalDate.now();
        int age = Period.between(person.getBirthYear(), currentDate).getYears();

        if (age < vehicle.getAgeRestriction()) {
            throw new MinorAgeException();
        }
        if (denyList.contains(person)) {
            throw new DenylistedPersonException();
        }
        for (Contract contract : contracts) {
            if ((Period.between(startDate, contract.getStartDate()).getDays() <= 0 || Period.between(endDate,
                    contract.getStartDate()).getDays() <= 0) && con.getVehicle().equals(contract.getVehicle())) {

                throw new LeaseLengthCollisionException();
            }
        }
        contracts.add(con);
    }

    public ArrayList<Person> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Person> customerList) {
        this.customerList = customerList;
    }

    public ArrayList<Person> getDenyList() {
        return denyList;
    }

    public void setDenyList(ArrayList<Person> denyList) {
        this.denyList = denyList;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(ArrayList<Contract> contracts) {
        this.contracts = contracts;
    }

    public void addPersonToDenyList(Person customer) {
    }
}
