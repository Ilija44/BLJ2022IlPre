package ch.noseryoung.ch;


public class Starter {


    public static void main(String[] args) {
        translator translator2 = new translator();
        String Input = ("hallo");
        String temp;
        char[] CharrArray = Input.toCharArray();

        for (char c : CharrArray) {
            temp = Character.toString(c).toLowerCase();
            System.out.print(translator2.getMorseTable().get(temp));
        }

        for (char c : CharrArray) {
            temp = Character.toString(c).toLowerCase();
            System.out.print(translator2.get2Morse().get(temp));
        }
    }

}