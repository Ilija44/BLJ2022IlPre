package ch.noseryoung.blj;

import java.awt.*;

public class CSPoint extends Point {
    private static int counter = 0;
    private int idPoint;

    public CSPoint(int x, int y) {
        super(x, y);
        setIdPoint(counter++);
    }

    @Override
    public String toString() {
        return idPoint + "[x=" + x + ",y=" + y + "]";
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getIdPoint() {
        return idPoint;
    }

    public void setIdPoint(int idPoint) {
        this.idPoint = idPoint;
    }

}
