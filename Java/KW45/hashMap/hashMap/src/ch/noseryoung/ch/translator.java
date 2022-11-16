package ch.noseryoung.ch;

import java.util.HashMap;

public class translator {
    public HashMap<String, String> morseTable = new HashMap<>();
    public HashMap<String, String> getMorse = new HashMap<>();
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

        morseTable.put("1", ".----");
        morseTable.put("2", "..---");
        morseTable.put("3", "...--");
        morseTable.put("4", "....-");
        morseTable.put("5", ".....");
        morseTable.put("6", "-....");
        morseTable.put("7", "--...");
        morseTable.put("8", "---..");
        morseTable.put("9", "----.");
        morseTable.put("0", "-----");

        morseTable.put(".", ".-.-.-");
        morseTable.put("?", "..--..");
        morseTable.put(",", "--..--");
        morseTable.put(" ", "/");

    }
    public HashMap<String, String> getMorseTable() {
        return morseTable;
    }

    public HashMap<String, String> get2Morse() {
        return getMorse;
    }

    public HashMap<String, String> getMorse(){


        for(String key: morseTable.keySet()) {
            getMorse.put(morseTable.get(key), key);
        }
        return getMorse;
    }
}
