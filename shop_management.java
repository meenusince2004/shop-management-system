import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Shop {
    private ArrayList<Product> products;

    public Shop() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        System.out.println("Available Products:");
        System.out.println("Name\tPrice\tQuantity");
        for (Product product : products) {
            System.out.println(product.getName() + "\t" + product.getPrice() + "\t" + product.getQuantity());
        }
    }

    public Product findProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

public class ShopManagement {
    public static void main(String[] args) {
        // Predefined credentials
        final String predefinedUsername = "admin";
        final String predefinedPassword = "password";

        // Create a user with predefined username and password
        User user = new User(predefinedUsername, predefinedPassword);

        // Ask for login credentials
        Scanner scanner = new Scanner(System.in);
        boolean authenticated = false;
        while (!authenticated) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Authenticate user
            if (user.authenticate(username, password)) {
                authenticated = true;
            } else {
                // If authentication fails, give the user another chance
                System.out.println("Authentication failed. Please try again.");
            }
        }

        // If authentication successful, proceed with shop management
        Shop shop = new Shop();

        while (true) {
            System.out.println("\n1. List Products");
            System.out.println("2. Add Product");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Products:");
                    System.out.println("Name\tPrice\tQuantity");
                    shop.listProducts();
                    break;
                case 2:
                    System.out.print("Enter product name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    shop.addProduct(new Product(name, price, quantity));
                    System.out.println("Product added successfully.");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}