import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class qBay {
    private static List<Item> itemsForSale = new ArrayList<>();
    static class Item {
        private double price;
        private String category;
        private String name;
       
        
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
