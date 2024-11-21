package controller;

import model.Hangman;
import model.HiddenWord;
import model.RandomWordSelector;
import model.UsedLetters;
import service.InputValidationGameService;
import view.MessageMenu;
import view.MessageGame;
import view.MessageUsedLetters;

import java.util.*;

public class Game {

    private Scanner scanner = new Scanner(System.in);

    public void start() {

        String targetWord = new RandomWordSelector("russian-mnemonic-words.txt").getRandomWord();

        if (targetWord.isEmpty()) {
            System.out.println("Не удалось найти слово");
        } else {
            HiddenWord hiddenWord = new HiddenWord(targetWord);

            boolean won = playGame(hiddenWord);

            MessageGame.printWord(hiddenWord.getSecretWord());

            if (won) {
                MessageMenu.printGameWon();
            } else {
                MessageMenu.printGameLost();
            }
        }
    }



    private boolean playGame(HiddenWord maskedWord) {
        MessageGame.printTaskInformation();

        Hangman hangman = new Hangman();
        MessageGame.printPicture(hangman.getHangmanState());
        UsedLetters usedLetters = new UsedLetters();

        while (hangman.isAlive()) {

            MessageUsedLetters.printUsedLetters(usedLetters.getUsedLetters());
            MessageGame.printWord(maskedWord.getMaskedWord());


            char guessedLetter = getLetterFromUser();

            if (usedLetters.hasLetter(guessedLetter)) {
                MessageGame.printUsedLetters();
            } else if (maskedWord.hasLetter(guessedLetter)) {
                MessageGame.printGuessSuccess();

                maskedWord.changeState(guessedLetter);
                if (maskedWord.isGuessed()) {
                    return true;
                }
            } else {
                hangman.incrementHangmanState();
                MessageGame.printGuessFailure();
            }
            usedLetters.addLetter(guessedLetter);
            MessageGame.printPicture(hangman.getHangmanState());
            MessageGame.printCountError(hangman.getHangmanState());
        }

        return false;
    }

    private char getLetterFromUser() {
        while (true) {
            MessageGame.printLetterPrompt();
            String inputLetter = scanner.nextLine();

            if (InputValidationGameService.isValidInputLetter(inputLetter)) {
                char letter = inputLetter.charAt(0);
                return Character.toLowerCase(letter);
            } else {
                MessageGame.printOnlyOneRussianLetterRequiredMessage();
            }
        }
    }

}
