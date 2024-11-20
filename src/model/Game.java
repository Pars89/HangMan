package model;

import view.MessageGame;

import java.util.*;

public class Game {

    static final int MAX_ERRORS = 6;
    private Scanner scanner = new Scanner(System.in);

    public boolean start() {

        String targetWord = new RandomWordSelector("russian-mnemonic-words.txt").getRandomWord();

        Set<Character> lettersToGuess = getUniqueLetters(targetWord);
        Set<Character> usedLetters = new HashSet<>();

        MessageGame hiddenWord = new MessageGame(targetWord);

        boolean won = playGame(hiddenWord, lettersToGuess, usedLetters);

        hiddenWord.printTargetWord();

        return won;
    }

    private Set<Character> getUniqueLetters(String word) {
        Set<Character> lettersToGuess = new HashSet<>();
        for (char c : word.toCharArray()) {
            lettersToGuess.add(c);
        }
        return lettersToGuess;
    }

    private boolean playGame(MessageGame hiddenWord, Set<Character> lettersToGuess, Set<Character> usedLetters) {
        MessageGame.printTaskInformation();
        int errorCount = 0;
        do {
            hiddenWord.printHiddenWord();

            char guessedLetter = getLetterFromUser();

            if (usedLetters.contains(guessedLetter)) {
                MessageGame.printUsedLetters();
            } else if (lettersToGuess.contains(guessedLetter)) {
                MessageGame.printGuessSuccess();

                hiddenWord.change_state(guessedLetter);

                lettersToGuess.remove(guessedLetter);
                if (lettersToGuess.isEmpty()) {
                    return true;
                }
            } else {
                errorCount++;
                MessageGame.printGuessFailure();
            }
            usedLetters.add(guessedLetter);
            hiddenWord.printGallows(errorCount);
        } while (errorCount < MAX_ERRORS);


        return false;
    }

    private char getLetterFromUser() {
        while (true) {
            MessageGame.printLetterPrompt();
            String input = scanner.nextLine();
            if (input.length() != 1) {
                MessageGame.printSingleLetterRequiredMessage();
            } else if (input.charAt(0) < 'а' || input.charAt(0) > 'я') {
                MessageGame.printOnlySmallRussianLettersRequiredMessage();
            } else {
                return input.charAt(0);
            }
        }
    }

}
