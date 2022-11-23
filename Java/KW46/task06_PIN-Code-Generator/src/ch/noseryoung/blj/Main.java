package ch.noseryoung.blj;


public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++) {
            System.out.println("000" + i);

        }
        for (int j = 10; j <= 99; j++) {
            System.out.println("00" + j);

        }
        for (int j = 100; j <= 999; j++) {
            System.out.println("0" + j);

        }
        for (int j = 1000; j <= 9999; j++) {
            System.out.println(j);

        }
    }
}
