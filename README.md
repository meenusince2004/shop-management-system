# 🛒 Shop Management System (Java)

This is a simple Java-based console application to simulate a basic shop management system. The application allows an admin to log in and perform actions like listing products and adding new products.

## 📌 Features

- Admin authentication with username and password
- Add new products with name, price, and quantity
- Display list of all available products
- Simple menu-driven interface

## 🔐 Default Admin Credentials

- **Username**: `admin`
- **Password**: `password`

> You can modify these credentials inside the `main` method in the `ShopManagement` class.

## 🚀 How to Run

1. Make sure you have **Java installed**.
2. Save the code in a file named `ShopManagement.java`.
3. Open terminal or command prompt in the project directory.
4. Compile the code:
   ```bash
   javac ShopManagement.java

5. Run the application:
   ```bash
   java ShopManagement

📂 Classes Used

Product: Represents each product with name, price, and quantity.

Shop: Holds a list of products and methods to add or list them.

User: Handles admin authentication.

ShopManagement: The main class with the program's logic and user interface.

📷 Demo

   ```mathematica
   Enter username: admin
   Enter password: password

   1. List Products
   2. Add Product
   3. Exit
   Enter your choice: 2
   Enter product name: Pen
   Enter product price: 10
   Enter product quantity: 100
   Product added successfully.


📌 Note

This project is intended for basic educational use and can be extended to include more features like:

-Product deletion or update

-Storing data in a file or database

-Better UI or GUI using JavaFX or Swing