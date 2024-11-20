package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class RandomWordSelector {

    private String fileName;

    public RandomWordSelector(String fileName) {
        this.fileName = fileName;
    }

    public String getRandomWord() {
        StringBuilder words = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line = "";
            while ((line = reader.readLine()) != null) {
                words.append(line + " ");
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
        String[] list_words = words.toString().split(" ");

        if (list_words.length == 0) {
            return null;
        } else {
            int randomIndex = getRandomIndex(list_words.length);
            String targetWord = list_words[randomIndex];

            return targetWord;
        }
    }

    private static int getRandomIndex(int maxValue) {
        Random random = new Random();

        return random.nextInt(maxValue);
    }
}
