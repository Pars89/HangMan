package model;

import java.util.HashSet;
import java.util.Set;

public class UsedLetters {

    private Set<Character> usedLetters;

    public UsedLetters() {
        this.usedLetters = new HashSet<>();
    }

    public Set<Character> getUsedLetters() {
        return usedLetters;
    }


    public boolean hasLetter(char inputLetter) {
        return usedLetters.contains(inputLetter);
    }


    public void addLetter(char letter) {
        usedLetters.add(letter);
    }
}
