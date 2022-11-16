package ch.noseryoung.ch;

import java.util.HashMap;

public class Starter {


    public static void main(String[] args) {
        translator translator2 = new translator();
        String Input = ("Hallo, wie gehts?");
        String temp;
        char[] CharrArray = Input.toCharArray();


        for (char c : CharrArray) {
            temp = Character.toString(c).toLowerCase();
            System.out.print(translator2.getMorseTable().get(temp));
        }
    }

}
