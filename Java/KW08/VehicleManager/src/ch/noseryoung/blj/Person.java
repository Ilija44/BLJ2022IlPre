package ch.noseryoung.blj;

import java.time.LocalDate;

public class Person {

    String firstName;
    String lastName;
    LocalDate birthYear;

    Person(String firstName, String lastName, LocalDate birthYear) {


        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }

    public boolean getFullName() {
        return false;
    }

    public LocalDate getBirthDate() {
        return null;
    }

}