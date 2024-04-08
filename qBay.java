import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class qBay {
	private static final List<Item> itemsForSale = new ArrayList<>();
	static class Item {
		private final double price;
		private final String category;
		private final String name;


		public Item(String name, String category, double price) {
			this.price = price;
			this.category = category;
			this.name = name;

		}
		public double getPrice() {
			return price;
		}
		public String getCategory() {
			return category;
		}
		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Name: " + name + ", Category: " + category + ", Price: " + price;
		}
	}

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
				sellMenu(scanner);
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

	private static void sellMenu(Scanner scanner) {
		while (true) {
			System.out.println("\nSell Menu:");
			System.out.println("1. See current items up for sale");
			System.out.println("2. Add a new item for sale");
			System.out.print("Select an option (or 'back' to return to the main menu): ");
			String input = scanner.nextLine();
			if (input.equals("back")) {
				return;
			} else if (input.equals("1")) {
				viewItemsForSale();
			} else if (input.equals("2")) {
				addNewItem(scanner);
			} else {
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
	
	private static void viewItemsForSale() {
		if (itemsForSale.isEmpty()){
			System.out.println("\nNo items currently for sale.");
		}else{
			System.out.println("\nCurrent Items for sale:");
			for (Item item : itemsForSale){
				System.out.println(item);
			}
		}
	}
	
	private static void addNewItem(Scanner scanner) {
		System.out.print("\nEnter item name: ");
		String name = scanner.nextLine();
		System.out.print("Enter item category: ");
		String category = scanner.nextLine();
		System.out.print("Enter item price: ");
		double price = scanner.nextDouble();
		scanner.nextLine(); // Consume newline
	
		itemsForSale.add(new Item(name, category, price));
		System.out.println("Item added successfully.");
	}

	private static void cartMenu() {
	}

	private static void logout() {
	}


}