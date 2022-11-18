package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Fish {

    private String name;
    private int field_x;
    private int field_y;

    public int getField_x() {
        return field_x;
    }

    public int getField_y() {
        return field_y;
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

    public static ArrayList<Fish> moveFish(ArrayList<Fish> fish, Aquarium myAquarium) {
        Scanner sc = new Scanner(System.in);
        int done = 0;
        for (Fish bsp : fish) {
            System.out.println(bsp.getName());
        }
        System.out.println("Which fish should get moved?");
        do {
            String name = sc.nextLine();
            for (Fish bsp : fish) {
                String bspname = bsp.getName();
                if (Objects.equals(bspname, name)) {
                    myAquarium.removeCords(bsp);
                    System.out.println("x coordinate?");
                    int x = sc.nextInt();
                    System.out.println("y coordinate?");
                    int y = sc.nextInt();
                    bsp.setField_x(x);
                    bsp.setField_y(y);
                    myAquarium.addCords(bsp);
                    done = 1;
                    break;
                }
            }
            System.out.println("not like this, try again");
        } while (done != 1);
        return fish;
    }

    public Fish(String name, boolean isSweet, int field_x, int field_y, Aquarium aquarium) {
        this.name = name;
        this.field_x = field_x;
        this.field_y = field_y;
    }

}