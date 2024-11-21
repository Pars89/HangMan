package model;

public class Hangman {

    private int hangmanState;

    static final int MAX_STATE = 5;

    public Hangman() {
        this.hangmanState = 0;
    }

    public int getHangmanState() {
        return hangmanState;
    }

    public void incrementHangmanState() {
        hangmanState++;
    }

    public boolean isAlive() {
        return hangmanState < MAX_STATE;
    }
}
