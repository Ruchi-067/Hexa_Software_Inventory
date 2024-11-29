package Inventory;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateQuantity(int productId, int quantity) {
        for (Product product : products) {
            if (product.getId() == productId) {
                product.setQuantity(product.getQuantity() + quantity);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void viewInventory() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product findProductById(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }
}

