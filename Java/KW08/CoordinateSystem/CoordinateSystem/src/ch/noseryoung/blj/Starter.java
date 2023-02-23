package ch.noseryoung.blj;

public class Starter {
    public static void main(String[] args) {

       Shape shapes[] = new Shape[4];
        shapes[0] = new CSPoint(240, 240);
        shapes[1] = new CSPoint(52, -10);
        shapes[2] = new CSPoint(152, -71);
        shapes[3] = new CSLineSegment(new CSPoint(-124, 54), new CSPoint(232, 65));


        CoordinateSystem cs = new CoordinateSystem(500, shapes);

        new CSRenderer(cs, 2, 15);


    }
}