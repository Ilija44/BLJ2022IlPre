package ch.noseryoung.blj;

import java.util.Arrays;

public class Aquarium {

        private int[][] aquarium = new int[10][10];

        public void printAquarium () {
            for (int i = 0; i < aquarium.length; i++) {
                System.out.print("▓▓");
            }
            System.out.println("▓");
            String aquariumAsString = Arrays.deepToString(aquarium);
            aquariumAsString = aquariumAsString.replace("[[", "▓").replace("], [", "▓\n▓").replace(", ", " ").replace("]]",
                    "▓").replace("0", "~").replace("1", "☺");
            System.out.println(aquariumAsString);

            for (int i = 0; i < aquarium.length; i++) {
                System.out.print("▓▓");
            }
            System.out.println("▓");
        }
    }

