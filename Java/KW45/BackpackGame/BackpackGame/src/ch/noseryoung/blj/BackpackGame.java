package ch.noseryoung.blj;

import java.util.Scanner;
import java.util.ArrayList;

public class BackpackGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> inputs = new ArrayList<String>();
        System.out.println("Enter 0 to quit");
        System.out.println("Enter the object you want to add to the Backpack:");
        String item;

        while (true) {

            item = scan.next();
            if(item.equals("0")) break;
            inputs.add(item);
            System.out.println("You take with:\n");

            for (String input : inputs) {
                System.out.println("-" + input);
            }


            System.out.println("Enter the object you want to add to the Backpack: \n");



        }


    }
}
