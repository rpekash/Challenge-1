import java.util.Scanner;

public class qBay {
    public static void main(String[] args) {
        welcomeScreen();
        if (login()) mainMenu();
    }

    private static void welcomeScreen() {
        System.out.println(" __      __         .__                                       __                    __________                 \n" +
                "/  \\    /  \\  ____  |  |    ____    ____    _____    ____   _/  |_   ____     ______\\______   \\_____    ___.__.\n" +
                "\\   \\/\\/   /_/ __ \\ |  |  _/ ___\\  /  _ \\  /     \\ _/ __ \\  \\   __\\ /  _ \\   / ____/ |    |  _/\\__  \\  <   |  |\n" +
                " \\        / \\  ___/ |  |__\\  \\___ (  <_> )|  Y Y  \\\\  ___/   |  |  (  <_> ) < <_|  | |    |   \\ / __ \\_ \\___  |\n" +
                "  \\__/\\  /   \\___  >|____/ \\___  > \\____/ |__|_|  / \\___  >  |__|   \\____/   \\__   | |______  /(____  / / ____|\n" +
                "       \\/        \\/            \\/               \\/      \\/                      |__|        \\/      \\/  \\/     ");
    }

    private static boolean login() {
        return true;
    }

    private static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Buy, Sell, Cart, Logout");
        switch (scanner.nextLine()) {
            case "Buy":
                buyMenu();
                break;
            case "Sell":
                sellMenu();
                break;
            case "Cart":
                cartMenu();
                break;
            case "Logout":
                logout();
                break;
        }
        scanner.close();
    }

    private static void buyMenu() {
    }

    private static void sellMenu() {
    }

    private static void cartMenu() {
    }

    private static void logout() {
    }


}
