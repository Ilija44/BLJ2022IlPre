package ch.noseryoung.test;

import org.example.TypeConverter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToCharSetTests {

    @Test
    public void StringToCharSet_Ilija_isCharArrayLowercase_ReturnsCharArray() {
        //GIVEN
        TypeConverter testee = new TypeConverter();
        String input = "Lewis";
        //WHEN
        Set<Character> expectedResult = new HashSet<>(Arrays.asList('l', 'e', 'w', 'i', 's'));
        //THEN
        assertEquals(expectedResult, testee.StringToCharSet(input));


    }

    @Test
    public void StringToCharSet_Ilija_isCharArrayLowercase_ReturnsCharArrayLowercase() {
        //GIVEN
        TypeConverter testee = new TypeConverter();
        String input = "Lewis";
        //WHEN
        Set<Character> expectedResult = new HashSet<>(Arrays.asList('L', 'e', 'w', 'i', 's'));
        //THEN
        assertEquals(expectedResult, testee.StringToCharSet(input));
    }
    @Test
    public void convertStringToLong_Ruben_IsNumberALongWithUnderscore_ReturnsTrue() {
        //GIVEN
        TypeConverter testee1 = new TypeConverter();
        String input = "10_000";
        Long expectetResult = 10000L;

        //WHEN
        Long result = testee1.convertStringToLong(input);
        //THEN
        assertEquals(expectetResult, result);
    }

    @Test
    public void convertStringToLong_Ruben_IsNumberALongWithSingleQuotes_ReturnsTrue() {
        //GIVEN
        TypeConverter testee2 = new TypeConverter();
        String input = "10'000";
        Long expectetResult = 10000L;

        //WHEN
        Long result = testee2.convertStringToLong(input);
        //THEN
        assertEquals(expectetResult, result);
    }
    @Test
    public void convertStringToLong_Lorena_ValidStringToLongValidString() {
        TypeConverter test = new TypeConverter();
        String validString = "10_000";
        Long expectedResult = 10000L;
        Long actualResult = test.convertStringToLong(validString);
        assertEquals(expectedResult, actualResult);
    }

}
