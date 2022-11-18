package ch.noseryoung.blj;
public class Fish {


    private  String name;
    private  boolean isSweet;
    private  int field_x;
    private  int field_y;
    private Aquarium aquarium;
    private static boolean isComp;

    public Fish() {
    }

    public  int getField_x() {
        return field_x;
    }

    public  int getField_y() {
        return field_y;
    }

    public Aquarium getAquarium() {
        return aquarium;
    }

    public  boolean isIsSweet() {
        return isSweet;
    }

    public String getName() {
        return name;
    }

    public void setField_x(int field_x) {
        this.field_x = field_x;
    }

    public void setField_y(int field_y) {
        this.field_y = field_y;
    }

    public Fish(String name, boolean isSweet, int field_x, int field_y, Aquarium aquarium) {
        this.name = name;
        this.isSweet = isSweet;
        this.field_x = field_x;
        this.field_y = field_y;
        this.aquarium = aquarium;

    }

    public void moveTo(int x, int y) {
        field_x = x;
        field_y = y;
    }
}