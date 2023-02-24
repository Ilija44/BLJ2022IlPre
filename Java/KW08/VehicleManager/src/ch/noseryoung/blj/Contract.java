package ch.noseryoung.blj;

import java.time.LocalDate;

public class Contract {
    private Person person;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private String contractModalities;

    public Contract(Person person, Vehicle vehicle, LocalDate startDate, LocalDate endDate, String contractModalities) throws MinorAgeException, LeaseLengthCollisionException, DenylistedPersonException {
        if (!vehicle.isAllowedToRent(person)) {
            throw new MinorAgeException("Person is too young to rent this vehicle");
        }

        if (VehicleRentalManager.checkLeaseCollision(startDate)) {
            throw new LeaseLengthCollisionException("Rental period overlaps with an existing contract");
        }
        if (VehicleRentalManager.isDenylisted()) {
            throw new DenylistedPersonException("Person is on the denylist");
        }

        this.person = person;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.contractModalities = contractModalities;

    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getContractModalities() {
        return contractModalities;
    }

    public void setContractModalities(String contractModalities) {
        this.contractModalities = contractModalities;
    }

    public Object getContractDetails() {
        return null;
    }
}
