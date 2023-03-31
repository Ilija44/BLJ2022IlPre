package ch.noseryoung.blj;

public class Game {

    private int[][] gameField;

    public Game() {
        gameField = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 1, 4, 2, 3, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0, 3, 4, 1, 0, 0},
                {0, 1, 4, 1, 1, 3, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 4, 0, 1, 1, 0},
                {0, 1, 3, 0, 3, 3, 3, 4, 1, 0},
                {0, 1, 0, 0, 0, 4, 0, 0, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
    }

    public void moveUp() {
        for (int i = 1; i < getRowCount() - 1; i++) {
            for (int j = 1; j < getColCount() - 1; j++) {
                if (getField()[i][j] == 2) {
                    if (getField()[i - 1][j] == 0) {
                        getField()[i][j] = 0;
                        getField()[i - 1][j] = 2;
                        System.out.println("UP");
                        return;
                    } else if (getField()[i - 1][j] == 3 && getField()[i - 2][j] == 0) {
                        getField()[i][j] = 0;
                        getField()[i - 1][j] = 2;
                        getField()[i - 2][j] = 3;
                        System.out.println("UP");
                        return;
                    }
                }
            }
        }
    }

    public void moveDown() {
        for (int i = getRowCount() - 2; i >= 1; i--) {
            for (int j = 1; j < getColCount() - 1; j++) {
                if (getField()[i][j] == 2 && getField()[i + 1][j] != 3 && getField()[i + 1][j] != 1) {
                    getField()[i][j] = 0;
                    getField()[i + 1][j] = 2;
                    if (getField()[i][j] == 2 && getField()[i + 1][j] == 3 && getField()[i + 2][j] != 1) {
                        getField()[i][j] = 0;
                        getField()[i + 1][j] = 2;
                        getField()[i + 2][j] = 3;
                    }
                }
            }
        }
        System.out.println("DOWN");
    }


    public void moveLeft() {
        for (int i = 1; i < getRowCount() - 1; i++) {
            for (int j = 1; j < getColCount() - 1; j++) {

                if (getField()[i][j] == 2 && getField()[i][j - 1] != 3 && getField()[i][j - 1] != 1) {
                    getField()[i][j] = 0;
                    getField()[i][j - 1] = 2;
                    if (getField()[i][j] == 2 && getField()[i][j - 1] == 3 && getField()[i][j - 2] != 1) {
                        getField()[i][j] = 0;
                        getField()[i][j - 1] = 2;
                        getField()[i][j - 2] = 3;
                    }
                }
            }
        }System.out.println("LEFT");
    }

    public void moveRight() {
        for (int i = 1; i < getRowCount() - 1; i++) {
            for (int j = 1; j < getColCount() - 1; j++) {

                if (getField()[i][j] == 2 && getField()[i][j + 1] != 3 && getField()[i][j + 1] != 1) {
                    getField()[i][j] = 0;
                    getField()[i][j + 1] = 2;
                    if (getField()[i][j] == 2 && getField()[i][j + 1] == 3 && getField()[i][j + 2] != 1) {
                        getField()[i][j] = 0;
                        getField()[i][j + 1] = 2;
                        getField()[i][j + 2] = 3;
                    }
                    System.out.println("RIGHT");
                    return;
                }
            }
        }
    }

    public void escAction() {
        System.out.println("ESC");
    }

    public int[][] getField() {
        return gameField;
    }

    public int getColCount() {
        return gameField.length;
    }

    public int getRowCount() {
        return gameField[0].length;
    }
}