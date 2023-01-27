package ch.noseryoung.blj;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
import java.util.HashMap;

public class FileIOHandler {

    public void FileReader(int singleCount, int wordCount, String mostCommonWord, HashMap<String, Integer> wordCounts) {
        try {
            FileWriter myWriter = new FileWriter("result.txt");
            myWriter.write("************************** \n");
            myWriter.write("TextFileAnalyzer in Java \n");
            myWriter.write("************************** \n");
            myWriter.write("------------------------------\n");
            myWriter.write("Most common word: " + '\t' + mostCommonWord + "\n");
            myWriter.write("Total number of words:" + '\t' + wordCount + "\n");
            myWriter.write("Number of unique words:" + '\t' + singleCount + "\n");
            myWriter.write("------------------------------" + "\n");
            for (String word : wordCounts.keySet()) {
                myWriter.write(word + '\t' + '\t' + wordCounts.get(word) + "\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.\n");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}