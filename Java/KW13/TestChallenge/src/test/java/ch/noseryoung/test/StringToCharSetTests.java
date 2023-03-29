package ch.noseryoung.test;

import org.example.TypeConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToCharSetTests {

    @Test
    public void StringToCharSet_Ilija_isCharArrayLowercase_ReturnsCharArray() {
        //GIVEN
        TypeConverter testee = new TypeConverter();
        String input = "Lewis";
        char[] expectedResult = {'L', 'e', 'w', 'i', 's'};
        //WHEN
        Set<char> result = testee.StringToCharSet(input);
        //THEN
        assertEquals(expectedResult, result);
    }
}
