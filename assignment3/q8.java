// Custom Exception
class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
// Product class
class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void purchase(int quantity) throws OutOfStockException {
        if (quantity > stock) {
            throw new OutOfStockException(
                "Sorry! \"" + name + "\" is out of stock. " +
                "Requested: " + quantity + ", Available: " + stock
            );
        }
        stock -= quantity;
        System.out.println("Purchase successful! " + quantity +
                           " unit(s) of \"" + name + "\" bought.");
        System.out.println("Remaining stock: " + stock);
    }
}
// Main class
public class q8 {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 2);

        // Attempt 1: Valid purchase
        try {
            System.out.println("Trying to buy 1 Laptop...");
            product.purchase(1);
        } catch (OutOfStockException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Attempt 2: Out of stock scenario
        try {
            System.out.println("\nTrying to buy 5 Laptops...");
            product.purchase(5);
        } catch (OutOfStockException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}