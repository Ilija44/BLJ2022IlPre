package ch.noseryoung.blj;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileAnalyzer {
    public static void Analyzer(String filePath) {
        ArrayList<String> wordList = new ArrayList<String>();
        Set<String> wortZaehler = new HashSet<>();
        File file = new File(filePath);
        try {
            Scanner scan1 = new Scanner(file);
            int wordCount = 0;
            HashMap<String, Integer> wordCounts = new HashMap<>();
            while (scan1.hasNext()) {
                String word = scan1.next();
                word = word.toLowerCase().replaceAll("[-,.?!\"]", "");
                if (!word.equals("")) {
                    wordCount++;
                    if (wordCounts.containsKey(word)) {
                        wordCounts.put(word, wordCounts.get(word) + 1);
                    } else {
                        wordCounts.put(word, 1);
                    }
                }
            }
            System.out.println("**************************");
            System.out.println("TextFileAnalyzer in Java");
            System.out.println("**************************");
            System.out.println("Total number of words: " + wordCount);
            String mostCommonWord = "";
            int maxCount = 0;
            for (String word : wordCounts.keySet()) {
                if (wordCounts.get(word) > maxCount) {
                    maxCount = wordCounts.get(word);
                    mostCommonWord = word;
                }
                System.out.println( word + "            " + wordCounts.get(word));
            }
            System.out.println("Most common word: " + mostCommonWord );
            scan1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Die Datei konnte nicht gefunden werden.");
        }
    }
}



