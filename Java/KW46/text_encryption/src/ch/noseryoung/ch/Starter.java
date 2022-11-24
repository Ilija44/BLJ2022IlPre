package ch.noseryoung.ch;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {

        {
            System.out.println("*********************************");
            System.out.println("Hello and welcome to my encrypter");
            System.out.println("*********************************");
            System.out.println("Enter 1 to encrypt a text");
            System.out.println("Enter 2 to decode the encrypted text");
            System.out.println("Enter 3 to exit");
            System.out.println("*********************************");
            int UserInput = 0;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\nEnter your command: ");
                UserInput = scanner.nextInt();

                if (UserInput == 1) {
                    Encryption.encrypt();
                }

                if (UserInput == 2) {
                    Encryption.decrypt();
                }


            } while (UserInput != 3);
            {
                System.out.println("Thank you for using me!");
            }
        }
    }
}

