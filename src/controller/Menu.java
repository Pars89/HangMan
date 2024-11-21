package controller;

import view.MessageMenu;

import java.util.Scanner;

public class Menu {

    private static final int MENU_OPTION_PLAY = 1;
    private static final int MENU_OPTION_EXIT = 2;

    public static void start() {
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        while (n != MENU_OPTION_EXIT) {
            MessageMenu.printMainMenu();

            try {
                n = scanner.nextInt();

                if (n != MENU_OPTION_PLAY && n != MENU_OPTION_EXIT) {
                    MessageMenu.printInvalidNumberForMenu();
                } else if (n == MENU_OPTION_PLAY) {
                    MessageMenu.printGameStarted();
                    new Game().start();
                }
            } catch (Exception e) {
                MessageMenu.printInputError();
                scanner.nextLine();
            }
        }

        MessageMenu.printExitApp();
        scanner.close();
    }
}
