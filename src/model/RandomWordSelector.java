package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class RandomWordSelector {

    private static final int EMPTY_LENGTH = 0;

    private String fileName;

    public RandomWordSelector(String fileName) {
        this.fileName = fileName;
    }

    public String getRandomWord() {
        StringBuilder rawWords = getWordsFromFile();

        String[] words = rawWords.toString().split(" ");

        if (words.length == EMPTY_LENGTH) {
            return "";
        }
        int randomIndex = getRandomIndex(words.length);

        return words[randomIndex];
    }

    private StringBuilder getWordsFromFile () {
        StringBuilder words = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                words.append(line).append(" ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return words;
    }

    private int getRandomIndex(int maxValue) {
        Random randomValue = new Random();

        return randomValue.nextInt(maxValue);
    }
}
