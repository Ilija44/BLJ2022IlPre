package ch.noseryoung.blj;

public class Vehicle {

    private String name;

    private int maxGeschwindigkeit;
    private int jahrgang;
    private int serienNummer;
    private int price;
    private int personenkapazität;

    public Vehicle(String name, int maxGeschwindigkeit, int jahrgang, int serienNummer, int price, int personenkapazität) {
        this.name = name;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.jahrgang = jahrgang;
        this.serienNummer = serienNummer;
        this.price = price;
        this.personenkapazität = personenkapazität;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }

    public void setMaxGeschwindigkeit(int maxGeschwindigkeit) {
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }

    public int getSerienNummer() {
        return serienNummer;
    }

    public void setSerienNummer(int serienNummer) {
        this.serienNummer = serienNummer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersonenkapazität() {
        return personenkapazität;
    }

    public void setPersonenkapazität(int personenkapazität) {
        this.personenkapazität = personenkapazität;
    }
}
