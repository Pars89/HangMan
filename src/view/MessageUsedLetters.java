package view;

import java.util.Set;

public class MessageUsedLetters {

    private static Set<Character> letters;

    public static void printUsedLetters(Set<Character> usedLetters) {
        System.out.print("Список, использованных букв: ");
        letters = usedLetters;
        for (Character letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }
}
