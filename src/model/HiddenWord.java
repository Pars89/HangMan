package model;

import java.util.HashSet;
import java.util.Set;

public class HiddenWord {
    private String secretWord;
    private StringBuilder maskedWord;

    private Set<Character> lettersToGuess;


    public HiddenWord(String targetWord) {
        this.secretWord = targetWord;
        maskedWord = new StringBuilder();
        for (int i = 0; i < targetWord.length(); i++) {
            maskedWord.append("_");
        }
        lettersToGuess = getUniqueLetters();
    }


    public void changeState(char inputLetter) {
        for (int i = 0; i < secretWord.length(); i++) {
            char letterFromSecretWord = secretWord.charAt(i);
            if (letterFromSecretWord == inputLetter) {
                maskedWord.setCharAt(i, inputLetter);
            }
        }
        lettersToGuess.remove(inputLetter);
    }


    public String getSecretWord() {
        return secretWord;
    }

    public String getMaskedWord() {
        return maskedWord.toString();
    }

    public boolean hasLetter(char rawGuessedLetter) {
        char guessedLetter = Character.toLowerCase(rawGuessedLetter);
        return lettersToGuess.contains(guessedLetter);
    }

    public boolean isGuessed() {
        return lettersToGuess.isEmpty();
    }

    private Set<Character> getUniqueLetters() {
        lettersToGuess = new HashSet<>();
        for (char letter : secretWord.toCharArray()) {
            lettersToGuess.add(letter);
        }
        return lettersToGuess;
    }
}
