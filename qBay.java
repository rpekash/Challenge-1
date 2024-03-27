import java.util.Scanner;

public class qBay {
    public static void main(String[] args) {
        welcomeScreen();
        mainMenu();
    }

    private static void welcomeScreen() {
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
