package ch.noseryoung.main;

import java.util.ArrayList;
import java.util.Comparator;


public class TriangleManager {

    private ShapeSideCreator generator;
    private TriangleValidator triangleValidator;
    private ArrayList<Triangle> triangles;

    public TriangleManager(ShapeSideCreator generator) {
        this.generator = generator;
        triangleValidator = new TriangleValidator();
        triangles = new ArrayList<>();
    }

    /**
     * This method is the entry point for the triangle manager.
     * It creates at least one triangle with the <code>ShapeSideCreator</code> instance
     * and prints the triangle with its information.
     */
    public void run() {

        printWelcomeText();

        Triangle triangle = generateTriangle();

        boolean isEquilateral = triangleValidator.isEquilateral(triangle);
        boolean isIsosceles = triangleValidator.isIsosceles(triangle);
        boolean isScalene = triangleValidator.isScalene(triangle);

        printTriangleInfo(triangle, isEquilateral, isIsosceles, isScalene);

        if (isEquilateral || isIsosceles) {
            triangles.add(triangle);
        }
    }

    /**
     * This method calls an implementation from the <code>ShapeSideCreator</code> Interface
     * to get three sides for a new triangle.
     *
     * @return created triangle
     */
    private Triangle generateTriangle() {
        return new Triangle(generator.createSide(), generator.createSide(), generator.createSide());
    }

    /**
     * This Method prints out the Triangle Information with the result form the validation.
     *
     * @param t
     * @param isEquilateral
     * @param isIsoceles
     * @param isScalene
     */
    private void printTriangleInfo(Triangle t, boolean isEquilateral, boolean isIsoceles, boolean isScalene) {
        System.out.println(t);
        System.out.println(isEquilateral);
        System.out.println(isIsoceles);
        System.out.println(isScalene);
        System.out.println(generateTriangle().getA());
        System.out.println(generateTriangle().getB());
        System.out.println(generateTriangle().getC());
    }

    /**
     * This method returns out all generated Triangles, which are sorted by side.
     * The Triangles are compared with its shortest side. The longest "shortest Side" is listed first.
     *
     * @return sorted triangle list
     */
    public ArrayList<Triangle> getAllTrianglesSortedByShortestSide() {
        triangles.sort(Comparator.comparingDouble(t -> t.getA()));
        return triangles;
    }

    /**
     * This method returns out all generated Triangles, which are sorted by side.
     * The Triangles are compared with its longest side. The longest "longest Side" is listed first.
     *
     * @return sorted triangle list
     */
    public ArrayList<Triangle> getAllTrianglesSortedByLongestSide() {
        ArrayList<Triangle> sortedTriangles = new ArrayList<>();
        sortedTriangles.sort(Comparator.comparingDouble(Triangle::getA).reversed());
        return sortedTriangles;
    }

    /**
     * This method prints a welcome text for the triangle manager.
     */
    private void printWelcomeText() {
        System.out.println("\n" +
                " __          __    _                                _                              _______     _                       _        __  __                                         \n" +
                " \\ \\        / /   | |                              | |                            |__   __|   (_)                     | |      |  \\/  |                                        \n" +
                "  \\ \\  /\\  / /___ | |  ___  ___   _ __ ___    ___  | |_  ___    _ __ ___   _   _     | | _ __  _   __ _  _ __    __ _ | |  ___ | \\  / |  __ _  _ __    __ _   __ _   ___  _ __ \n" +
                "   \\ \\/  \\/ // _ \\| | / __|/ _ \\ | '_ ` _ \\  / _ \\ | __|/ _ \\  | '_ ` _ \\ | | | |    | || '__|| | / _` || '_ \\  / _` || | / _ \\| |\\/| | / _` || '_ \\  / _` | / _` | / _ \\| '__|\n" +
                "    \\  /\\  /|  __/| || (__| (_) || | | | | ||  __/ | |_| (_) | | | | | | || |_| |    | || |   | || (_| || | | || (_| || ||  __/| |  | || (_| || | | || (_| || (_| ||  __/| |   \n" +
                "     \\/  \\/  \\___||_| \\___|\\___/ |_| |_| |_| \\___|  \\__|\\___/  |_| |_| |_| \\__, |    |_||_|   |_| \\__,_||_| |_| \\__, ||_| \\___||_|  |_| \\__,_||_| |_| \\__,_| \\__, | \\___||_|   \n" +
                "                                                                            __/ |                                __/ |                                        __/ |            \n" +
                "                                                                           |___/                                |___/                                        |___/             \n ");
    }
}



