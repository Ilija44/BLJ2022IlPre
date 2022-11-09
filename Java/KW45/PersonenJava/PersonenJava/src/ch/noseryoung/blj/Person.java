package ch.noseryoung.blj;

public class Person {

    private String name;
    private int age;
    private String Bestfriend;
    private int yes;
    private String Surname;

    public Person(String name, String Surname, int age, int yes) {
        this.name = name;
        this.age = age;
        this.Bestfriend = Bestfriend;
        this.yes = yes;
        this.Surname = Surname;
    }

    public void present() {
        System.out.println("Hello my name is " + name + " " + Surname + " and my age is " + age + " I dont have a bestfriend");
    }

    public void present2() {
        System.out.println("Hello my name is " + name + " " + Surname + " and my age is " + age + " my bestfriend is " + Bestfriend);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBestfriend() {
        return Bestfriend;
    }

    public void setBestfriend(String Bestfriend) {
        this.Bestfriend = Bestfriend;
    }

    public int getYes() {
        return yes;
    }

    public void setYes(int yes) {
        this.yes = yes;
    }

    public String getSurname() {
        return Surname;
    }



    public void setSurname(String surname) {
        Surname = surname;
    }
}

