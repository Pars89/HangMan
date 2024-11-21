package view;

public class MessageGame {

    private static final String[][] PICTURES_HANGMAN_STATE = {
            {
                    "  __________   ",
                    "  |            ",
                    "  |            ",
                    "  |            ",
                    "  |            ",
                    "  |            ",
                    "  |            ",
                    "  |            ",
                    "  |            "
            },
            {
                    "  __________   ",
                    "  |        |   ",
                    "  |        |   ",
                    "  |            ",
                    "  |            ",
                    "  |            ",
                    "  |            ",
                    "  |            ",
                    "  |            "
            },
            {
                    "  __________   ",
                    "  |        |   ",
                    "  |        |   ",
                    "  |        O   ",
                    "  |            ",
                    "  |            ",
                    "  |            ",
                    "  |            ",
                    "  |            "
            },
            {
                    "  __________   ",
                    "  |        |   ",
                    "  |        |   ",
                    "  |        O   ",
                    "  |            ",
                    "  |            ",
                    "  |            ",
                    "  |       ___  ",
                    "  |       | |  "
            },
            {
                    "  __________   ",
                    "  |        |   ",
                    "  |        |   ",
                    "  |        O   ",
                    "  |       '|'  ",
                    "  |       -0-  ",
                    "  |       / \\ ",
                    "  |       ___  ",
                    "  |       | |  "
            },
            {
                    "  __________   ",
                    "  |        |   ",
                    "  |        |   ",
                    "  |        O   ",
                    "  |       '|'  ",
                    "  |       -0-  ",
                    "  |       / \\ ",
                    "  |            ",
                    "  |            "
            }
    };

    public static void printPicture(int numberState) {
        String[] picture = PICTURES_HANGMAN_STATE[numberState];

        for(String line : picture) {
            System.out.println(line);
        }
    }

    public static void printWord(String targetWord) {
        System.out.println("Слово: " + targetWord);
    }

    public static void printLetterPrompt() {
        System.out.print("Введите букву: ");
    }

    public static void printOnlyOneRussianLetterRequiredMessage() {
        System.out.println("Вы должны ввести только одну русскую букву");
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

    public static void printCountError(int countError) {
        System.out.println("Количество ошибок: " + countError);
    }
}
