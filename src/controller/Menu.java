package controller;

import view.MessageMenu;

import java.util.Scanner;

public class Menu {

    private static final int MENU_OPTION_PLAY = 1;
    private static final int MENU_OPTION_EXIT = 2;

    public static void start() {
        int command = 0;
        Scanner scanner = new Scanner(System.in);

        while (command != MENU_OPTION_EXIT) {
            MessageMenu.printMainMenu();

            try {
                command = scanner.nextInt();

                if (command != MENU_OPTION_PLAY && command != MENU_OPTION_EXIT) {
                    MessageMenu.printInvalidNumberForMenu();
                } else if (command == MENU_OPTION_PLAY) {
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
