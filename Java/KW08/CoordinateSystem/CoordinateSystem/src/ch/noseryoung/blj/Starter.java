package ch.noseryoung.blj;

public class Starter {
    public static void main(String[] args) {

        CSPoint point[] = new CSPoint[2];
        point[0] = new CSPoint(5, 0);
        point[1] = new CSPoint(52, -10);

        CSLineSegment linePoints[] = new CSLineSegment[1];
        linePoints[0] = new CSLineSegment(point[0], point[1]);

        CoordinateSystem cs = new CoordinateSystem(500, point, linePoints);


        new CSRenderer(cs, 2, 15);


    }
}