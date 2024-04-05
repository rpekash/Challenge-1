import java.util.HashMap;
import java.util.Scanner;

public class qBay {
	public static void main(String[] args) {
		welcomeScreen();
		if (login()) mainMenu();
	}

	private static void welcomeScreen() {
		System.out.println("""
				 __      __         .__                                        __                     __________                \s
				/  \\    /  \\  ____  |  |    ____    ____    _____    ____    _/  |_   ____      ______\\______   \\_____    ___.__.
				\\   \\/\\/   /_/ __ \\ |  |  _/ ___\\  /  _ \\  /     \\ _/ __ \\   \\   __\\ /  _ \\    / ____/ |    |  _/\\__  \\  <   |  |
				 \\        / \\  ___/ |  |__\\  \\___ (  <_> )|  Y Y  \\\\  ___/    |  |  (  <_> )  < <_|  | |    |   \\ / __ \\_ \\___  |
				  \\__/\\  /   \\___  >|____/ \\___  > \\____/ |__|_|  / \\___  >   |__|   \\____/    \\__   | |______  /(____  / / ____|
				       \\/        \\/            \\/               \\/      \\/                        |__|        \\/      \\/  \\/    \s""");
	}

	private static boolean login() {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> accounts = new HashMap<>();
		// Hardcoded accounts
		accounts.put("Tina", "ThiefUser644");
		accounts.put("Osian", "TheVougeMaster");
		accounts.put("Marty", "martyparty");
		accounts.put("Barthe", "TheKnightestKnight");

		for (int t = 0; t < 3; t++) {
			if (t > 0) {
				int remainingAttempts = 3 - t;
				if (remainingAttempts == 1) {

					System.out.println("1 attempt remains");
				} else {
					System.out.printf("%d attempts remain%n", remainingAttempts);
				}
			}
			System.out.println("Enter your username: ");
			String username = scanner.nextLine();
			if (accounts.containsKey(username)) {
				System.out.println("Enter your password: ");
				if (scanner.nextLine().equals(accounts.get(username))) {
					return true;
				}
				System.out.println("Incorrect password.");
			} else {
				System.out.println("Username was not found.");
			}
		}
		System.out.println("Error. Too many failed attempts. Account temporarily locked.");
		return false;
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
