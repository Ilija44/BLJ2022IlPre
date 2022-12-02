package ch.noseryoung.ch;

public class Person {

    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String name;


    public Person(int birthYear, int birthMonth, int birthDay, String name) {
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public String getName() {
        return name;
    }
}
