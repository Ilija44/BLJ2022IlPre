package ch.noseryoung.blj;

import java.util.ArrayList;

public class CoordinateSystem {
    private int CoordinateSystemSize;


    private Shape[] allShapes;
    private ArrayList<CSLineSegment> lines = new ArrayList<>();


    public CoordinateSystem(int coordinateSystemSize, Shape[] shapes) {
        if (coordinateSystemSize < 0 || coordinateSystemSize % 20 != 0) {
            throw new IllegalArgumentException();
        }
        this.CoordinateSystemSize = coordinateSystemSize;
        this.allShapes = shapes;
    }

    public Shape[] getAllShapes() {
        return allShapes;
    }

    public CoordinateSystem(int size) {
        this.CoordinateSystemSize = size;
    }

    public int getCoordinateSystemSize() {
        return CoordinateSystemSize;
    }

    public void setCoordinateSystemSize(int coordinateSystemSize) {
        CoordinateSystemSize = coordinateSystemSize;
    }

    public ArrayList<CSLineSegment> getLines() {
        return lines;
    }

    public void setLines(ArrayList<CSLineSegment> lines) {
        this.lines = lines;
    }
}
