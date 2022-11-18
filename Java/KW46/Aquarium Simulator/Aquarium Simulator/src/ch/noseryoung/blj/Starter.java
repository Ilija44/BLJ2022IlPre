package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.Scanner;

import static ch.noseryoung.blj.Aquarium.deleteFish;
import static ch.noseryoung.blj.Fish.moveFish;

public class Starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Fish> fish = new ArrayList<Fish>();
        Aquarium myAquarium;
        int menu;

        System.out.println("how big should your aquarium be?");
        int size = sc.nextInt();
        System.out.println("is it sweet water? [true/false]");
        boolean isSweet = sc.nextBoolean();
        myAquarium = new Aquarium(isSweet, size);
        myAquarium.initAquarium();
        createFish(fish, myAquarium);

        do {
            System.out.println("1: create a fish");
            System.out.println("2: remove a fish");
            System.out.println("3: move a fish");
            System.out.println("4: show the aquarium");
            System.out.println("5: exit");
            menu = sc.nextInt();
            if (menu == 1) {
                createFish(fish, myAquarium);
            } else if (menu == 2) {
                deleteFish(fish, myAquarium);
            } else if (menu == 3) {
                moveFish(fish, myAquarium);
            } else if (menu == 4) {
                myAquarium.aquaState();
            }
        } while (menu != 5);
    }

    public static void createFish(ArrayList<Fish> fish, Aquarium myAquarium) {
        boolean cont;

        String name = null;
        int x = 0;
        int y = 0;
        boolean water;
        boolean A_isSweet = myAquarium.isSweet();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of a fish: ");
            name = sc.nextLine();

            System.out.println("Is it a freshwater fish? (True | False)");
            water = sc.nextBoolean();

            System.out.println("Enter X position of the fish: ");
            x = sc.nextInt();

            System.out.println("Enter Y position of the fish: ");
            y = sc.nextInt();
            Fish newfish = new Fish(name, water, x, y, myAquarium);
            fish.add(newfish);
            if (water == A_isSweet) {
                myAquarium.addCords(newfish);
            } else {
                myAquarium.death(newfish);
            }
            System.out.println("Do you want to create another fish? [y/n]");
            String yn = sc.next();
            cont = yn.equalsIgnoreCase("y");

        } while (cont);
    }

}