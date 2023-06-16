package org.example;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private int[][] gameField;

    private Point playerPos;
    private List<Point> goalsPos;

    public Game(int [][] gameField) {
        this.gameField = gameField;
        loadLevelData();
        loadEntityData();
    }

    private void loadLevelData() {
        goalsPos = new ArrayList<>();
    }

    private void loadEntityData() {
        for (int col = 0; col < getColCount(); col++) {
            for (int row = 0; row < getRowCount(); row++) {
                switch (gameField[col][row]) {
                    case 2 -> playerPos = new Point(col, row);
                    case 4 -> goalsPos.add(new Point(col, row));
                    case 5 -> {
                        goalsPos.add(new Point(col, row));
                        gameField[col][row] = 3;
                    }
                }
            }
        }
    }

    private void move(int xDir, int yDir) {
        Point nextPos = new Point(playerPos.x + xDir, playerPos.y + yDir);
        Point nextNextPos = new Point(nextPos.x + xDir, nextPos.y + yDir);

        if (isInBounds(nextNextPos) && isWalkable(nextNextPos) && isBox(nextPos)) {
            gameField[nextPos.x][nextPos.y] = 0;
            gameField[nextNextPos.x][nextNextPos.y] = 3;
        }
        if (isInBounds(nextPos) && isWalkable(nextPos)) {
            gameField[playerPos.x][playerPos.y] = 0;
            gameField[playerPos.x += xDir][playerPos.y += yDir] = 2;
        }
        handleWin();
    }

    private boolean isWalkable(Point point) {
        return List.of(0, 4).contains(gameField[point.x][point.y]);
    }

    private boolean isBox(Point point) {
        return gameField[point.x][point.y] == 3;
    }

    private boolean isInBounds(Point point) {
        return (0 <= point.x && point.x < getColCount()) && (0 <= point.y && point.y < getRowCount());
    }

    private int handleGoals() {
        int goalCount = 0;
        for (Point goalPos : goalsPos) {
            switch (gameField[goalPos.x][goalPos.y]) {
                case 0 -> gameField[goalPos.x][goalPos.y] = 4;
                case 3 -> goalCount++;
            }
        }
        return goalCount;
    }

    public void handleWin() {
        if (handleGoals() == goalsPos.size()) {
            System.exit(0);
        }
    }

    public void moveUp() {
        move(-1, 0);
    }

    public void moveDown() {
        move(1, 0);
    }

    public void moveLeft() {
        move(0, -1);
    }

    public void moveRight() {
        move(0, 1);
    }

    public void escAction() {
        loadLevelData();
        loadEntityData();
    }

    public int[][] getGameField() {
        return gameField;
    }

    public int getColCount() {
        return gameField.length;
    }

    public int getRowCount() {
        return gameField[0].length;
    }

    public List<Point> getGoalsPos() {
        return goalsPos;
    }
}
