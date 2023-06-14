package ch.noseryoung.blj;

public class Starter {
    public static void main(String[] args) {
        StartProgram();
    }
    public static void StartProgram() {
        Game game = new Game();
        GameIO gameIO = new GameIO(game, 64, 0.9);
    }
}
