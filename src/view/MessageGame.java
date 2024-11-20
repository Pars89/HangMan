package view;

public class MessageGame {

    private String targetWord;
    private StringBuilder hiddenWord;


    public MessageGame(String targetWord) {
        this.targetWord = targetWord;
        hiddenWord = new StringBuilder();
        for (int i = 0; i < targetWord.length(); i++) {
            hiddenWord.append("_");
        }
    }

    public void change_state(char charAt) {
        for (int i = 0; i < targetWord.length(); i++) {
            if (targetWord.charAt(i) == charAt) {
                hiddenWord.setCharAt(i, charAt);
            }
        }
    }

    public void printHiddenWord() {
        System.out.println("Слово: " + hiddenWord.toString());
    }

    public void printTargetWord() {
        System.out.println("Слово: " + targetWord);
    }

    public static void printLetterPrompt() {
        System.out.print("Введите букву: ");
    }

    public static void printSingleLetterRequiredMessage() {
        System.out.println("Вы должны ввести только одну букву!");
    }

    public static void printOnlySmallRussianLettersRequiredMessage() {
        System.out.println("Вы должны ввести только букву [а-я]");
    }

    public static void printTaskInformation() {
        System.out.println("Загадано некоторое слово\nПопробуйте ее угадать");
    }

    public static void printGuessSuccess() {
        System.out.println("Вы угадали букву!");
    }

    public static void printGuessFailure() {
        System.out.println("Вы не угадали букву!");
    }

    public static void printUsedLetters() {
        System.out.println("Вы уже использовали эту букву!");
    }

    public String getTargetWord() {
        return targetWord;
    }

    public StringBuilder getHiddenWord() {
        return hiddenWord;
    }

    public void printGallows(int wrongGuesses) {
        System.out.println();
        switch (wrongGuesses) {
            case 1:
                System.out.println("  __________    Количество ошибок: " + wrongGuesses);
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 2:
                System.out.println("  __________    Количество ошибок: " + wrongGuesses);
                System.out.println("  |        |");
                System.out.println("  |        |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 3:
                System.out.println("  __________    Количество ошибок: " + wrongGuesses);
                System.out.println("  |        |");
                System.out.println("  |        |");
                System.out.println("  |        0");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 4:
                System.out.println("  __________    Количество ошибок: " + wrongGuesses);
                System.out.println("  |        |");
                System.out.println("  |        |");
                System.out.println("  |        0");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |       ___");
                System.out.println("__|__     | |");
                break;
            case 5:
                System.out.println("  __________    Количество ошибок: " + wrongGuesses);
                System.out.println("  |        |");
                System.out.println("  |        |");
                System.out.println("  |        0");
                System.out.println("  |       '|'");
                System.out.println("  |       -0-");
                System.out.println("  |       / \\");
                System.out.println("  |       ___");
                System.out.println("__|__     | |");
                break;
            case 6:
                System.out.println("  __________    Количество ошибок: " + wrongGuesses);
                System.out.println("  |        |");
                System.out.println("  |        |");
                System.out.println("  |        0");
                System.out.println("  |       '|'");
                System.out.println("  |       -0-");
                System.out.println("  |       / \\");
                System.out.println("  |");
                System.out.println("__|__");
                break;
        }
    }
}
