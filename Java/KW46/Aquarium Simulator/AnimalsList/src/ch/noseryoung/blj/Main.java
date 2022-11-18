package ch.noseryoung.blj;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cat> myCats = new ArrayList<>();

        Cat Noah = new Cat("Noah", "britsh shorthair", "grey", 11);
        Cat Henri = new Cat("Henri", "german shorthair", "orange", 2);
        Cat Elmar = new Cat("Elmar", "swiss shorthair", "red", 17);

        myCats.add(Noah);
        myCats.add(Henri);
        myCats.add(Elmar);


        for(Cat c : myCats){
            System.out.println("Name: " + c.getName());
            System.out.println("color: " + c.getColor());
            System.out.println("breed: " + c.getBreed());
            System.out.println("age: " + c.getAge());

        }






    }
}
