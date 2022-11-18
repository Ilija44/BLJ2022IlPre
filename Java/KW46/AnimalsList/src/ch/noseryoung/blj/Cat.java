package ch.noseryoung.blj;

public class Cat {

    private String name;
    private String breed;
    private String color;
    private int age;


    public Cat(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }


    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
