package ch.noseryoung.blj;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class TextFileAnalyzer {
    public static void Analyzer(String filePath) {
        int singleCount = 0;

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
            String mostCommonWord = "";
            int maxCount = 0;
            for (String word : wordCounts.keySet()) {
                if (wordCounts.get(word) > maxCount) {
                    maxCount = wordCounts.get(word);
                    mostCommonWord = word;
                }
            }
            System.out.println("------------------------------");
            System.out.println("Most common word: " + '\t' + mostCommonWord);
            System.out.println("Total number of words: " + '\t' + wordCount);
            for (String word : wordCounts.keySet()) {
                if (wordCounts.get(word) == 1) {
                    singleCount++;
                }
            }
            System.out.println("Number of unique words: " + '\t' + singleCount);
            System.out.println("------------------------------");
            for (String word : wordCounts.keySet()) {
                System.out.println(word + '\t' + '\t' + wordCounts.get(word));
            }
            scan1.close();
            FileIOHandler filereader = new FileIOHandler();
            filereader.FileReader(singleCount, wordCount, mostCommonWord, wordCounts);
        } catch (FileNotFoundException e) {
            System.out.println("Die Datei konnte nicht gefunden werden.");
        }
    }
}



