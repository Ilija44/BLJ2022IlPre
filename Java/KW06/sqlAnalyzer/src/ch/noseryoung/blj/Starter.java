package ch.noseryoung.blj;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public class Starter {
    public static void main(String[] args) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get("C:\\Users\\ilija\\BLJ2022IlPre\\Java\\KW06\\sqlAnalyzer\\src\\ch\\noseryoung\\blj\\result.txt")));

        } catch (IOException e) {
            System.out.println("Die Datei konnte nicht gelesen werden.");
        }

        try {
            long lineCount = Files.lines(Paths.get("C:\\Users\\ilija\\BLJ2022IlPre\\Java\\KW06\\sqlAnalyzer\\src\\ch\\noseryoung\\blj\\result.txt")).count();
            long Zeilen = lineCount - 2;
            System.out.println("Anzahl der Zeilen: " + Zeilen);
        } catch (IOException e) {
            System.out.println("Die Datei konnte nicht gelesen werden.");
        }

        System.out.println(content);
    }
}

