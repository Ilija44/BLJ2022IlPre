package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.printAquarium();

        Scanner sc = new Scanner(System.in);
        ArrayList<Fish> fish = new ArrayList<Fish>();
        Aquarium myAquarium;


         System.out.println("Enter the Aquarium size: ");
        int size = sc.nextInt();
        System.out.println("Is in the Aquarium sweet water (true | false)? ");
        boolean isSweet = sc.nextBoolean();
        myAquarium = new Aquarium(isSweet, size);
        myAquarium.initAquarium();
        System.out.println("Aquarium is created");
        createFish(fish, myAquarium);

        // do {
        System.out.println("[1] - Create fish");
        System.out.println("[2] - Delete fish");
        System.out.println("[3] - Move fish");
        System.out.println("[4] - Show aquarium");
        System.out.println("[0] - Exit Program");
    }


   
}