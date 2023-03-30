package org.example;

import java.util.HashSet;
import java.util.Set;

public class TypeConverter {
    /**
     * This method converts a String to a Short.
     * Accepted Values are:
     * - (only at first place)
     * _ and ' (10_000 and 10'000 are equal to 10000)
     * numbers 0-9
     *
     * @param toConvert String to be converted
     * @return converted short
     * @throws IllegalArgumentException if String cannot be converted
     * @author <todo: Name of author>
     */
    public static short convertStringToShort(String toConvert) throws IllegalArgumentException {
        if (toConvert == null || toConvert.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty or null");
        }
        toConvert = toConvert.replaceAll("[^\\d-]+", "");
        return Short.parseShort(toConvert);
    }

    /**
     * This method converts a String to a Double.
     * Accepted Values are:
     * - (only at first place)
     * _ and ' (10_000 and 10'000 are equal to 10000)
     * . and , for decimal (only one allowed)
     * numbers 0-9
     *
     * @param toConvert String to be converted
     * @return converted Double
     * @throws IllegalArgumentException if String cannot be converted
     * @author <todo: Name of author>
     */
    public static double convertStringToDouble(String toConvert) throws IllegalArgumentException {
        if (toConvert == null || toConvert.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty or null");
        }
        toConvert = toConvert.replaceAll("[^\\d.]", "");
        return Double.parseDouble(toConvert);

    }

    /**
     * This method converts a String to a Long.
     * Accepted Values are:
     *    - (only at first place)
     *    _ and ' (10_000 and 10'000 are equal to 10000)
     *    numbers 0-9
     *
     * @param toConvert String to be converted
     * @return converted long
     * @throws IllegalArgumentException if String cannot be converted
     *
     * @author <todo: Name of author>
     */
    /**
     * This method converts a String to a Long.
     * Accepted Values are:
     * - (only at first place)
     * _ and ' (10_000 and 10'000 are equal to 10000)
     * numbers 0-9
     *
     * @param toConvert String to be converted
     * @return converted long
     * @throws IllegalArgumentException if String cannot be converted
     * @author <todo: Ilija>
     */
    public static Long convertStringToLong(String toConvert) throws IllegalArgumentException {
        if (toConvert == null || toConvert.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty or null");
        }
        toConvert = toConvert.replaceAll("[_']", "");
        return Long.parseLong(toConvert);

    }

    /**
     * This method converts a String to a lowercase Char Array.
     * Accepted Values are:
     * - (only after second place and before second last place, e.g. ge-laufen is ok, g-elaufen is not ok)
     * letters a-z and A-Z
     *
     * @param toConvert String to be converted
     * @return converted Char Array
     * @throws IllegalArgumentException if String cannot be converted
     * @author <todo: Name of author>
     */
    public static char[] StringToCharArray(String toConvert) throws IllegalArgumentException {
        if (toConvert == null || toConvert.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty or null");
        }
        String input = "Hello World";
        char[] charArray = input.toCharArray();
        return new char[]{};
    }


    //public static Set<char> StringToCharSet(String toConvert) {
    //todo implement
    //     return new Hashset<char>();
    //  }
}
