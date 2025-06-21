import java.util.Scanner;

public class EcommerceSearch {
    public static void main(String[] args) {
        String[] products = {
            "Laptop", "Smartphone", "Headphones",
            "Smartwatch", "Camera", "Shoes",
            "Books", "Bag", "Charger", "Keyboard"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product name to search: ");
        String searchQuery = scanner.nextLine();

        boolean found = false;
        for (String product : products) {
            if (product.equalsIgnoreCase(searchQuery)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Product found in the catalog!");
        } else {
            System.out.println("Product not found.");
        }
    }
}
