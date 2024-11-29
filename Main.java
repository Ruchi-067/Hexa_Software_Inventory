package Inventory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. View Inventory");
            System.out.println("3. Process Sale");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    inventory.addProduct(new Product(id, name, quantity, price));
                    break;

                case 2:
                    inventory.viewInventory();
                    break;

                case 3:
                    System.out.print("Enter Product ID to Sell: ");
                    int productId = scanner.nextInt();
                    System.out.print("Enter Quantity to Sell: ");
                    int sellQuantity = scanner.nextInt();
                    Transaction.processSale(inventory, productId, sellQuantity);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

