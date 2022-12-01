package ch.noseryoung.blj;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {


        boolean leap = false;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int year = myObj.nextInt();

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;

            } else
                leap = true;
        } else leap = false;

        if (leap)
            System.out.println(year + " is a leap Year");
        else System.out.println(year + " is not a leap Year");

    }
}
