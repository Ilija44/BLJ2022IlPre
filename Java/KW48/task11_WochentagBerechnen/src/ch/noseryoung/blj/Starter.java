package ch.noseryoung.blj;

public class Starter {


    public static String CheeckWeekDay(int day, int month, int year){
        int yearYY = year % 100;
        int YYyear = year / 100;
        int calculate = yearYY + (yearYY / 4);
        int temp = 1;
        String WeekDay = "";

        if (month == 1 || month == 10) {
            temp = 1;
        } else if (month == 2 || month == 3 || month == 11) {
            temp = 4;
        } else if (month == 4 || month == 7) {
            temp = 0;
        } else if (month == 5) {
            temp = 2;
        } else if (month == 6) {
            temp = 5;
        } else if (month == 8) {
            temp = 3;
        } else if (month == 9 || month == 12) {
            temp = 6;
        }

        calculate += temp;
        calculate += day;
    }
    public static void main(String[] args) {

    }
}
