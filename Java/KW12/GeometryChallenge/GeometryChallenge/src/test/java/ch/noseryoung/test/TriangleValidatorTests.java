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
    public void isNotInt_withBoolean_ReturnsTrue(){

        TriangleValidator testee2 = new TriangleValidator();

        Triangle t = new Triangle(3.3, 3.3, 3.3);

        boolean expectedResult = true;

        boolean result = testee2.isNotInt(t);

        assertEquals(expectedResult, result);
    }

    @Test
    public void IsEquilateral_WithNegativeSides_ReturnsTrue(){

        TriangleValidator testee3 = new TriangleValidator();

        Triangle t = new Triangle(-3,  -3, -3);

        boolean expectedResult = true;

        boolean result = testee3.AllSiteNegative(t);

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




    @Test
    public void IsScalene_WithwrongNumbers_ReturnsFalse(){

        TriangleValidator testee5 = new TriangleValidator();

        Triangle t = new Triangle(1,  2, 5);

        boolean expectedResult = false;

        boolean result = testee5.isEquilateral(t);

        assertEquals(expectedResult, result);
    }


    @Test
    public void IsScalen_WithGoodNumbers_ReturnsTrue(){

        TriangleValidator testee10 = new TriangleValidator();

        Triangle t = new Triangle(4,  5, 6);

        boolean expectedResult = true;

        boolean result = testee10.isScalene(t);

        assertEquals(expectedResult, result);
    }


    @Test
    public void SiteIsNull_WithALl0_ReturnsTrue(){

        TriangleValidator testee6 = new TriangleValidator();

        Triangle t = new Triangle(0,  0, 0);

        boolean expectedResult = true;

        boolean result = testee6.isAllNull(t);

        assertEquals(expectedResult, result);
    }

    @Test
    public void OneSiteIsNull_WithOneSite0_ReturnsTrue(){

        TriangleValidator testee7 = new TriangleValidator();

        Triangle t = new Triangle(0,  3, 4);

        boolean expectedResult = true;

        boolean result = testee7.isNull(t);

        assertEquals(expectedResult, result);
    }
    @Test
    public void OneSiteNegative_WithNegativeNumber_ReturnsTrue(){

        TriangleValidator testee8 = new TriangleValidator();

        Triangle t = new Triangle(-4,  3, 4);

        boolean expectedResult = true;

        boolean result = testee8.OneSiteNegative(t);

        assertEquals(expectedResult, result);
    }
    @Test
    public void TwoSiteNegative_WithNegativeNumber_ReturnsTrue(){

        TriangleValidator testee9 = new TriangleValidator();

        Triangle t = new Triangle(-4,  -5, 4);

        boolean expectedResult = true;

        boolean result = testee9.OneSiteNegative(t);

        assertEquals(expectedResult, result);
    }
    @Test
    public void _WithNegativeNumber_ReturnsTrue(){

        TriangleValidator testee9 = new TriangleValidator();

        Triangle t = new Triangle(-4,  -5, 4);

        boolean expectedResult = true;

        boolean result = testee9.OneSiteNegative(t);

        assertEquals(expectedResult, result);
    }

}
