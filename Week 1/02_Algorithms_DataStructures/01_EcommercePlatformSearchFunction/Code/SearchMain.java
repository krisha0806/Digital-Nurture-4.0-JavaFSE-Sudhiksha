public class SearchMain {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Book", "Education"),
            new Product(4, "Phone", "Electronics")
        };

        Product result1 = LinearSearch.search(products, "Shirt");
        if (result1 != null)
            System.out.println("Linear Search: Found " + result1.productName);
        else
            System.out.println("Linear Search: Not Found");

        BinarySearch.sortProducts(products);
        Product result2 = BinarySearch.search(products, "Shirt");
        if (result2 != null)
            System.out.println("Binary Search: Found " + result2.productName);
        else
            System.out.println("Binary Search: Not Found");
    }
}