

import org.example.Game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;





class SokobanTest {
    private final int FLOOR = 0;
    private final int WALL = 1;
    private final int PLAYER = 2;
    private final int BOX = 3;
    private final int GOAL = 4;
    @Test
    public void playerMovement_ontoFloor_right() {
        Game g = new Game(new int[][]{{PLAYER, FLOOR}});
        int[][] expected = new int[][]{{FLOOR, PLAYER}};

        g.moveRight();

        for (int i = 0; i < g.getColCount(); i++) {
            Assertions.assertArrayEquals(expected[i], g.getGameField()[i]);
        }
    }

    @Test
    public void playerMovement_ontoWall_right() {
        Game g = new Game(new int[][]{{PLAYER, WALL}});
        int[][] expected = new int[][]{{PLAYER, WALL}};

        g.moveRight();

        for (int i = 0; i < g.getColCount(); i++) {
            Assertions.assertArrayEquals(expected[i], g.getGameField()[i]);
        }
    }

    @Test
    public void playerMovement_ontoGoal_right() {
        Game g = new Game(new int[][]{{PLAYER, GOAL}});
        int[][] expected = new int[][]{{FLOOR, PLAYER}};

        g.moveRight();

        for (int i = 0; i < g.getColCount(); i++) {
            Assertions.assertArrayEquals(expected[i], g.getGameField()[i]);
        }
    }

    @Test
    public void playerMovement_ontoGoalAndThenOntoFloor_GoalShouldBeThere_right() {
        Game g = new Game(new int[][]{{PLAYER, GOAL, FLOOR}});
        int[][] expected = new int[][]{{FLOOR, GOAL, PLAYER}};

        g.moveRight();
        g.moveRight();

        for (int i = 0; i < g.getColCount(); i++) {
            Assertions.assertArrayEquals(expected[i], g.getGameField()[i]);
        }
    }

    @Test
    public void playerMovement_boxMovesWithPlayer_right() {
        Game g = new Game(new int[][]{{PLAYER, BOX, FLOOR}});
        int[][] expected = new int[][]{{FLOOR, PLAYER, BOX}};

        g.moveRight();

        for (int i = 0; i < g.getColCount(); i++) {
            Assertions.assertArrayEquals(expected[i], g.getGameField()[i]);
        }
    }

    @Test
    public void playerMovement_twoBoxes_shouldntMove_right() {
        Game g = new Game(new int[][]{{PLAYER, BOX, BOX}});
        int[][] expected = new int[][]{{PLAYER, BOX, BOX}};

        g.moveRight();

        for (int i = 0; i < g.getColCount(); i++) {
            Assertions.assertArrayEquals(expected[i], g.getGameField()[i]);
        }
    }

    @Test
    public void playerMovement_oneBoxesOneWall_shouldntMove_right() {
        Game g = new Game(new int[][]{{PLAYER, BOX, WALL}});
        int[][] expected = new int[][]{{PLAYER, BOX, WALL}};

        g.moveRight();

        for (int i = 0; i < g.getColCount(); i++) {
            Assertions.assertArrayEquals(expected[i], g.getGameField()[i]);
        }
    }

    @Test
    public void playerMovement_BoxMovesOnGoal_right() {
        Game g = new Game(new int[][]{{PLAYER, BOX, GOAL}});
        int[][] expected = new int[][]{{FLOOR, PLAYER, BOX}};

        g.moveRight();

        for (int i = 0; i < g.getColCount(); i++) {
            Assertions.assertArrayEquals(expected[i], g.getGameField()[i]);
        }
    }

    @Test
    public void playerMovement_moveOutOfBounds_shouldntMove_right() {
        Game g = new Game(new int[][]{{FLOOR, PLAYER}});
        int[][] expected = new int[][]{{FLOOR, PLAYER}};

        g.moveRight();

        for (int i = 0; i < g.getColCount(); i++) {
            Assertions.assertArrayEquals(expected[i], g.getGameField()[i]);
        }
    }

    @Test
    public void playerMovement_moveOutOfBoundsWithBox_shouldntMove_right() {
        Game g = new Game(new int[][]{{PLAYER, BOX}});
        int[][] expected = new int[][]{{PLAYER, BOX}};

        g.moveRight();

        for (int i = 0; i < g.getColCount(); i++) {
            Assertions.assertArrayEquals(expected[i], g.getGameField()[i]);
        }
    }

}