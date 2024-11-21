package service;

public class InputValidationGameService {

    private static final int EXPECTED_INPUT_LENGTH = 1;

    private final static char FIRST_LOWER_LETTER = 'а';
    private final static char LAST_LOWER_LETTER = 'я';

    private final static char FIRST_UPPER_LETTER = 'А';
    private final static char LAST_UPPER_LETTER = 'Я';

    public static boolean isValidInputLetter(String inputLetter) {

        if (inputLetter == null || inputLetter.length() != EXPECTED_INPUT_LENGTH) {
            return false;
        }
        char letter = inputLetter.charAt(0);

        return (letter >= FIRST_LOWER_LETTER && letter <= LAST_LOWER_LETTER) ||
                (letter >= FIRST_UPPER_LETTER && letter <= LAST_UPPER_LETTER);
    }
}
