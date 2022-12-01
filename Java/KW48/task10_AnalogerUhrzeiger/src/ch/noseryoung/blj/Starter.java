package ch.noseryoung.blj;

public class Starter {
    public static void main(String[] args) {
        System.out.println("11:15 Uhr:");
        computeHourHandAngle();
        computeMinuteHandAngle();
    }

    public static void computeHourHandAngle() {
        double hr;
        int m = 15;
        int h = 11;


        hr = 0.5 * (60 * h + m);
        System.out.println("■ Stundenzeiger bei " + hr + "°");


    }

    public static void computeMinuteHandAngle() {

        int m = 15;
        int min;

        min = m * 6;
        System.out.println("■ Minutenzeiger bei " + min + "°");


    }
}
