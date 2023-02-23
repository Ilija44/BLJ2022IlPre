package ch.noseryoung.blj;

public class Vehicle {

    private String name;
    private int personen;
    private int maxGeschwindigkeit;
    private int jahr;
    private int jahrgang;
    private int serienNummer;
    private int price;

    private int personenkapazität;

    public Vehicle(String name, int personen, int maxGeschwindigkeit, int jahr, int jahrgang, int serienNummer, int price, int personenkapazität) {
        this.name = name;
        this.personen = personen;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.jahr = jahr;
        this.jahrgang = jahrgang;
        this.serienNummer = serienNummer;
        this.price = price;
        this.personenkapazität = personenkapazität;
    }
}
