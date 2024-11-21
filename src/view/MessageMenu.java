package view;

public class MessageMenu {
    public static void printMainMenu() {
        System.out.println("1. Начать новую игру");
        System.out.println("2. Выйти из приложения");
    }

    public static void printInvalidNumberForMenu() {
        System.out.println("Вы неверно ввели число!");
        System.out.println("Попробуйте еще раз!");
    }

    public static void printGameStarted() {
        System.out.println("Игра началась");
    }

    public static void printGameWon() {
        System.out.println("Вы выйграли");
    }

    public static void printGameLost() {
        System.out.println("Вы проиграли");
    }

    public static void printInputError() {
        System.out.println("Ошибка ввода! Пожалуйста, введите число (1 или 2).");
    }

    public static void printExitApp() {
        System.out.println("Выход из приложения");
    }
}
