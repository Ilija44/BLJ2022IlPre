package ch.noseryoung.blj;

public class CoordinateSystem {
    private int Coordinatesystemsize;
    private CSPoint[] allPoints;

    public CoordinateSystem(int coordinatesystemsize, CSPoint[] point) {
        if (coordinatesystemsize < 0 || coordinatesystemsize % 20 != 0) {
            throw new IllegalArgumentException();
        }
        this.Coordinatesystemsize = coordinatesystemsize;
        this.allPoints = point;

    }

    public int getCoordinatesystemsize() {
        return Coordinatesystemsize;
    }

    public void setCoordinatesystemsize(int coordinatesystemsize) {
        Coordinatesystemsize = coordinatesystemsize;
    }

    public CSPoint[] getAllPoints() {
        return allPoints;
    }

    public void setAllPoints(CSPoint[] allPoints) {
        this.allPoints = allPoints;
    }
}
