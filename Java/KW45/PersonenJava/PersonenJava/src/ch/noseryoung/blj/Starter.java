package ch.noseryoung.blj;

import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {

        final int max_person = 3;
        int yes2 = 0;
        int buffer = 0;

        Person personarr[] = new Person[max_person];

        for (int i = 0; i < max_person; i++) {

            System.out.println("enter your name: ");
            Scanner myObj = new Scanner(System.in);
            String Name2 = myObj.nextLine();
            System.out.println("enter your surname: ");
            String surname2 = myObj.nextLine();
            System.out.println("enter your age: ");
            int age2 = myObj.nextInt();
            System.out.println("do you have a best friend? 1/0: ");
            yes2 = myObj.nextInt();
            myObj.nextLine();
            if (yes2 == 1) {
                System.out.println("enter the name of your bestfriend: ");
                String bestfriend = myObj.nextLine();
                personarr[i] = new Person(Name2, surname2, age2, yes2);
                personarr[i].setBestfriend(bestfriend);
                buffer = 1;

            } else {
                personarr[i] = new Person(Name2, surname2, age2, yes2);
                buffer = 0;
            }
        }
        for (int i = 0; i < max_person; i++) {
            if (yes2 == 1 || buffer == 1) {
                personarr[i].present2();
            } else {
                personarr[i].present();
            }
        }
    }
}