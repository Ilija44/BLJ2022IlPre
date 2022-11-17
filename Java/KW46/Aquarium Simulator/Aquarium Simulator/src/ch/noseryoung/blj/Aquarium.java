package ch.noseryoung.blj;
import java.util.Arrays;
import java.util.Random;


public class Aquarium {
    private boolean isSweet;
    private static int[][] FishPosition;
    private int size;
    private int[][] aquarium = new int[10][10];

    public void printAquarium() {
        for (int i = 0; i < aquarium.length; i++) {
            System.out.print("▓▓");
        }
        System.out.println("▓");
        String aquariumAsString = Arrays.deepToString(aquarium);
        aquariumAsString = aquariumAsString.replace("[[", "▓").replace("], [", "▓\n▓").replace(", ", " ").replace("]]",
                "▓").replace("0", "~").replace("1", "🐟");
        System.out.println(aquariumAsString);

        for (int i = 0; i < aquarium.length; i++) {
            System.out.print("▓▓");
        }
        System.out.println("▓");
    }

    public class aquarium {
        private boolean isSweet;
        private static int[][] FishPosition;
        private int size;


        public aquarium() {
            //default constructor
        }


        public aquarium(boolean isSweet, int size) {
            this.isSweet = isSweet;
            this.size = size;
        }

        public void initAquarium() {
            FishPosition = new int[size][size];
            for (int i = 0; i < FishPosition.length; i++) {
                for (int a = 0; a < FishPosition.length; a++) {
                    FishPosition[i][a] = 0;
                }
            }
        }

        public void addCords(Fish fish) {
            FishPosition[fish.getCor_y()][fish.getCor_x()] = 1;
        }

        public void removeCords(Fish fish) {
            FishPosition[fish.getCor_y()][fish.getCor_x()] = 0;
        }

        public void setDead(Fish fish) {
            FishPosition[fish.getCor_y()][fish.getCor_x()] = 2;
        }

        public boolean isSweet() {
            return isSweet;
        }
    }


    public Aquarium() {
        //default constructor
    }


    public Aquarium(boolean isSweet, int size) {
        this.isSweet = isSweet;
        this.size = size;
    }

    public void initAquarium() {
        FishPosition = new int[size][size];
        for (int i = 0; i < FishPosition.length; i++) {
            for (int a = 0; a < FishPosition.length; a++) {
                FishPosition[i][a] = 0;
            }
        }
    }

    public void addCords(Fish fish) {
        FishPosition[fish.getCor_y()][fish.getCor_x()] = 1;
    }

    public void removeCords(Fish fish) {
        FishPosition[fish.getCor_y()][fish.getCor_x()] = 0;
    }

    public void setDead(Fish fish) {
        FishPosition[fish.getCor_y()][fish.getCor_x()] = 2;
    }

    public void aquaState() {
        Random random = new Random();
        for (int i = 0; i < FishPosition.length; i++) {
            for (int a = 0; a < FishPosition.length; a++) {
                int randomNumber = random.nextInt(2);
                if (FishPosition[i][a] == 0) {
                    System.out.print("~ ");
                } else if (FishPosition[i][a] == 2) {
                    System.out.print("X_X ");
                } else if (randomNumber == 0) {
                    System.out.print("<>< ");
                } else {
                    System.out.print("><> ");
                }
            }
            System.out.println();
        }
    }

    public boolean isSweet() {
        return isSweet;
    }
}