package Inventory;

public class Transaction {
    public static void processSale(Inventory inventory, int productId, int quantity) {
        Product product = inventory.findProductById(productId);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        if (product.getQuantity() < quantity) {
            System.out.println("Insufficient stock.");
            return;
        }

        product.setQuantity(product.getQuantity() - quantity);
        double totalPrice = product.getPrice() * quantity;
        System.out.println("Transaction successful! Total: $" + totalPrice);
    }
}

