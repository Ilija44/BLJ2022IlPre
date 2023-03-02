package ch.noseryoung.blj;

public class Vehicle {
    private String model;

    private int maxSpeed;
    private int year;
    private int serialNumber;
    private int price;
    private int personCapacity;
    private int ageRestriction;

    public Vehicle(String model, int maxSpeed, int year, int serialNumber, int price, int personCapacity, int ageRestriction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.serialNumber = serialNumber;
        this.price = price;
        this.personCapacity = personCapacity;
        this.ageRestriction = ageRestriction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersonCapacity() {
        return personCapacity;
    }

    public void setPersonCapacity(int personCapacity) {
        this.personCapacity = personCapacity;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }
}
