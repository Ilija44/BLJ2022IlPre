package ch.noseryoung.ch;

import com.sun.java.accessibility.util.Translator;

import java.io.CharArrayWriter;
import java.util.HashMap;
import java.util.Map;

public class Starter {


    public static void main(String[] args) {
        translator translator2 = new translator();
        String Input = ("Ich bin Noah");
        String temp;
        char[] CharrArray = Input.toCharArray();


        for (char c : CharrArray) {
            temp = Character.toString(c).toLowerCase();
            System.out.print(translator2.getMorseTable().get(temp));
        }
    }
}
