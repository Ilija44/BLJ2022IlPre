
package ch.noseryoung.blj;

public class Starter {
    public static String CheckWeekDay(int day, int month, int year) {
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

        if (YYyear == 18) {
            calculate += 2;
        } else if (YYyear == 20) {
            calculate += 6;
        } else if (YYyear == 21) {
            calculate += 4;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    if (month == 1 || month == 2) {
                        calculate++;
                    }
                }
            }
        }

        int result = calculate % 7;
        if (result == 2) {
            WeekDay = "Monday";
        } else if (result == 3) {
            WeekDay = "Tuesday";
        } else if (result == 4) {
            WeekDay = "Wednesday";
        } else if (result == 5) {
            WeekDay = "Thursday";
        } else if (result == 6) {
            WeekDay = "Friday";
        } else if (result == 7) {
            WeekDay = "Saturday";
        } else if (result == 8) {
            WeekDay = "Sunday";
        } else {
            WeekDay = "Something is wrong";
        }
        return WeekDay;
    }

    public static void main(String[] args) {
        int day = 7;
        int month = 12;
        int year = 2022;

        String result = CheckWeekDay(day, month, year);
        System.out.println(result);

    }
}
