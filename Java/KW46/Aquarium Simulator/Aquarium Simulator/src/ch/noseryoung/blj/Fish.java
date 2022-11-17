package ch.noseryoung.blj;

public class Fish {


    private String name;
    private boolean isSweet;
    private int Fish_x;
    private int Fish_y;
    private Aquarium aquarium;

    public Fish() {
        //default constructor
    }

    public int getCor_x() {
        return Fish_x;
    }

    public int getCor_y() {
        return Fish_y;
    }

    public Aquarium getAquarium() {
        return aquarium;
    }

    public boolean isIsSweet() {
        return isSweet;
    }

    public String getName() {
        return name;
    }

    public void setCor_x(int cor_x) {
        Fish_x = cor_x;
    }

    public void setCor_y(int cor_y) {
        Fish_y = cor_y;
    }

    public Fish(String name, boolean isSweet, int Cor_x, int Cor_y, Aquarium aquarium) {
        this.name = name;
        this.isSweet = isSweet;
        this.Fish_x = Cor_x;
        this.Fish_y = Cor_y;
        this.aquarium = aquarium;

    }

    public void moveTo(int x, int y) {
        Fish_x = x;
        Fish_y = y;
    }
}