package controller;

import model.Game;
import view.MessageController;

import java.util.Scanner;

public class Controller {
    public static void start() {
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            MessageController.printMainMenu();

            try {
                n = scanner.nextInt();

                if (n != 1 && n != 2) {
                    MessageController.printInvalidNumberForMenu();
                } else if (n == 1) {
                    MessageController.printGameStarted();
                    if (new Game().start()) {
                        MessageController.printGameWon();
                    } else {
                        MessageController.printGameLost();
                    }
                }
            } catch (Exception e) {
                MessageController.printInputError();
                scanner.nextLine();
            }
        } while (n != 2);

        MessageController.printExitApp();
        scanner.close();
    }
}
