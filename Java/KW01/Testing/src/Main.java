import java.NHI.Random;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 25;
        int int_random = rand.nextInt(upperbound);
        System.out.println(int_random);
    }
}
