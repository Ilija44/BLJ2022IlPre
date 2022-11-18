package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Aquarium {
    private final boolean isSweet;
    private static int[][] aquarium;
    private final int size;

    public Aquarium(boolean isSweet, int size) {
        this.isSweet = isSweet;
        this.size = size;
    }

    public void initAquarium() {
        aquarium = new int[size][size];
        for (int i = 0; i < aquarium.length; i++) {
            for (int a = 0; a < aquarium.length; a++) {
                aquarium[i][a] = 0;
            }
        }
    }

    public void addCords(Fish fish) {
        aquarium[fish.getField_y()][fish.getField_x()] = 1;
    }

    public void removeCords(Fish fish) {
        aquarium[fish.getField_y()][fish.getField_x()] = 0;
    }

    public void death(Fish fish) {
        aquarium[fish.getField_y()][fish.getField_x()] = 2;
    }

    public void aquaState() {
        Random random = new Random();
        for (int[] ints : aquarium) {
            for (int a = 0; a < aquarium.length; a++) {
                int randomNumber = random.nextInt(2);
                if (ints[a] == 0) {
                    System.out.print("\uD83D\uDCA7");
                } else if (ints[a] == 2) {
                    System.out.print("🐟");
                } else if (randomNumber == 0) {
                    System.out.print("\uD83D\uDC20");
                } else {
                    System.out.print("\uD83D\uDC20");
                }
            }
            System.out.println();
        }
    }

    public boolean isSweet() {
        return isSweet;
    }

    public static ArrayList<Fish> deleteFish(ArrayList<Fish> fish, Aquarium myAquarium) {
        Scanner sc = new Scanner(System.in);
        for (Fish bsp : fish) {
            System.out.println(bsp.getName());
        }
        System.out.println("Which fish should die?");
        String name = sc.nextLine();
        fish.remove(name);
        for (Fish bsp : fish) {
            String bspname = bsp.getName();
            if (Objects.equals(bspname, name)) {
                myAquarium.removeCords(bsp);
            }
        }
        return fish;
    }

}