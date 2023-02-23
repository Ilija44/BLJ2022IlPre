package ch.noseryoung.blj;

import java.awt.*;

public class CSPoint extends Point implements Shape {
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

    @Override
    public void draw(Graphics2D g2d, CoordinateSystem cs, int fieldScale) {
        CSPoint translatedPoint = translatePoint(cs, fieldScale, this.x, this.y);
            g2d.setColor(Color.BLUE);
            g2d.drawLine(translatedPoint.x, translatedPoint.y, translatedPoint.x, translatedPoint.y);

    }

}
