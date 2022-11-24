package ch.noseryoung.ch;

import java.util.Scanner;

public class Encryption {

    public static void encrypt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text to encrypt");
        String userIn = scanner.nextLine();
        for (int i = 0; i < userIn.length(); i++) {
            int e = userIn.charAt(i);

            e = e + 2;
            int j = e;
            char ch = (char) j;
            System.out.print(ch);
        }
    }

    public static void decrypt() {
        String pin = "2";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the PIN: ");
        String userPin = scanner.nextLine();
        if (pin.equals(userPin)) {
            System.out.println("\nenter the encrypted text: ");
            String userInp = scanner.nextLine();
            for (int k = 0; k < userInp.length(); k++) {
                int f = userInp.charAt(k);
                f = f - 2;
                int l = f;
                char de = (char) l;
                System.out.print(de);
            }

        } else {
            System.out.println("Pin was incorrect");
        }
    }

}
