package ch.noseryoung.test;

import ch.noseryoung.main.Triangle;
import ch.noseryoung.main.TriangleValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TriangleValidatorTests {

    @Test
    public void isEquilateral_EquilateralTriangle_ReturnsTrue() {

        TriangleValidator testee = new TriangleValidator();

        Triangle t = new Triangle(3, 3, 3);

        boolean expectedResult = true;

        boolean result = testee.isEquilateral(t);

        assertEquals(expectedResult, result);
    }



    @Test
    public void isEquilateral_EquilateralTriangle2_ReturnsTrue(){

        TriangleValidator testee2 = new TriangleValidator();

        Triangle t = new Triangle(3.3, 3.3, 3.3);

        boolean expectedResult = true;

        boolean result = testee2.isEquilateral(t);

        assertEquals(expectedResult, result);
    }

    @Test
    public void IsEquilateral_WithNegativeSides_ReturnsTrue(){

        TriangleValidator testee3 = new TriangleValidator();

        Triangle t = new Triangle(-3,  -3, -3);

        boolean expectedResult = true;

        boolean result = testee3.isEquilateral(t);

        assertEquals(expectedResult, result);
    }



    @Test
    public void IsIsosceles_WithCorrectNumbers_ReturnsTrue(){

        TriangleValidator testee4 = new TriangleValidator();

        Triangle t = new Triangle(2,  2, 3);

        boolean expectedResult = true;

        boolean result = testee4.isIsosceles(t);

        assertEquals(expectedResult, result);
    }




}
