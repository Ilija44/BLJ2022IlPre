package ch.noseryoung.blj;

import java.time.LocalDate;
import java.util.ArrayList;

public class VehicleRentalManager {

    private ArrayList<Person> customerlist = new ArrayList<>();

    private ArrayList<Person> denyList = new ArrayList<>();

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    private ArrayList<Contract> contracts = new ArrayList<>();

    public static boolean checkLeaseCollision(LocalDate startDate) {
        return false;
    }

    public static boolean isDenylisted() {
        return false;
    }


    public ArrayList<Person> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Person> customerlist) {
        this.customerlist = customerlist;
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

    public void addPerson(Person person1) {
    }

    public void addVehicle(Vehicle car1) {
    }

    public void createContract(Person person1, Vehicle car1, LocalDate now, LocalDate plusDays, String miete_für_eine_woche) {
    }
}
