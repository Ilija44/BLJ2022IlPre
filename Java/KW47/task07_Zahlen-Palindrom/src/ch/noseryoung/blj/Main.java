package ch.noseryoung.blj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, sum = 0, temp;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        int num = scan.nextInt();
        temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum)

            System.out.println("is a palindrome number ");
        else
            System.out.println("is not palindrome");
    }

}

