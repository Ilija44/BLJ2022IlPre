package ch.noseryoung.ch;

import java.util.HashMap;
public class translator {
    public HashMap<String, String> morseTable = new HashMap<String, String>();

    public translator() {
        morseTable.put("a", ".-");
        morseTable.put("b", "-...");
        morseTable.put("c", "-.-.");
        morseTable.put("d", "-..");
        morseTable.put("e", ".");
        morseTable.put("f", "..-.");
        morseTable.put("g", "--.");
        morseTable.put("h", "....");
        morseTable.put("i", ".---");
        morseTable.put("k", "-.-");
        morseTable.put("l", ".-..");
        morseTable.put("m", "--");
        morseTable.put("n", "---");
        morseTable.put("o", ".--.");
        morseTable.put("p", ".--.");
        morseTable.put("q", "--.-");
        morseTable.put("r", ".-.");
        morseTable.put("s", "...");
        morseTable.put("t", "-");
        morseTable.put("u", "..-");
        morseTable.put("v", "...-");
        morseTable.put("w", ".--");
        morseTable.put("x", "-..-");
        morseTable.put("y", "-.--");
        morseTable.put("z", "--..");
    }

    public HashMap<String, String> getMorseTable() {
        return morseTable;
    }
}
