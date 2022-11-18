package ch.noseryoung.blj;
import java.util.Random;

public class Aquarium {
    private boolean isSweet;
    private static int[][] aquarium;
    private int size;

    public Aquarium() {
    }


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
        for (int i = 0; i < aquarium.length; i++) {
            for (int a = 0; a < aquarium.length; a++) {
                int randomNumber = random.nextInt(2);
                if (aquarium[i][a] == 0) {
                    System.out.print("\uD83D\uDCA7");
                } else if (aquarium[i][a] == 2) {
                    System.out.print("🐟");
                } else if (randomNumber == 0) {
                    System.out.print("\uD83D\uDC20");
                } else{
                    System.out.print("\uD83D\uDC20");
                }
            }
            System.out.println();
        }
    }

    public boolean isSweet() {
        return isSweet;
    }
}