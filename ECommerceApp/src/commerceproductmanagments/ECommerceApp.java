package commerceproductmanagments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        Map<Integer, Order> liveOrders = new HashMap<>();

        // Add products (Books, Furniture, etc.)
        products.add(new Product("B001", "Atomic Habits", "Books", 400, 5));
        products.add(new Product("F002", "Wooden Chair", "Furniture", 1800, 3));
        products.add(new Product("C003", "Cotton Shirt", "Clothing", 999, 8));
        products.add(new Product("E004", "Smartphone", "Electronics", 25000, 4));

        while (true) {
            System.out.println("\n--- E-Commerce Menu ---");
            System.out.println("1. Place Order");
            System.out.println("2. Cancel Order");
            System.out.println("3. Show All Orders (File)");
            System.out.println("4. Update Stock Quantity");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int option = sc.nextInt();
            sc.nextLine(); // clear newline

            switch (option) {
                case 1:
                    // Customer Info
                    System.out.print("Enter name: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    Customer customer = new Customer(cname, email);

                    // Show products
                    System.out.println("\nAvailable Products:");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        products.get(i).display();
                    }

                    System.out.print("Select product (1-" + products.size() + "): ");
                    int choice = sc.nextInt() - 1;
                    sc.nextLine();
                    Product product = products.get(choice);

                    if (product.stock <= 0) {
                        System.out.println("Sorry, out of stock!");
                        break;
                    }

                    // Discount
                    Discountable discount = p -> p * 0.9;
                    double finalAmount = discount.applyDiscount(product.price);

                    // Payment
                    System.out.print("Choose Payment: 1. UPI  2. CashOnDelivery: ");
                    int ptype = sc.nextInt();
                    sc.nextLine();

                    Payment payment;
                    if (ptype == 1) {
                        System.out.print("Enter UPI ID: ");
                        String upi = sc.nextLine();
                        payment = new UpiPayment(upi);
                    } else {
                        payment = new CashOnDelivery();
                    }

                    payment.pay(finalAmount);
                    product.stock--; // reduce stock

                    Order order = new Order(customer, product, finalAmount, payment.getMethod());
                    order.saveToFile();
                    liveOrders.put(order.orderId, order);

                    System.out.println("Order Placed! Order ID: " + order.orderId);
                    break;

                case 2:
                    System.out.print("Enter Order ID to cancel: ");
                    int cancelId = sc.nextInt();
                    Order ord = liveOrders.get(cancelId);
                    if (ord != null) {
                        ord.cancel();
                    } else {
                        System.out.println("Order not found or already cancelled.");
                    }
                    break;

                case 3:
                    Order.showAllOrders();
                    break;

                case 4:
                    // Stock update
                    System.out.println("\nUpdate Stock:");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i).name + " - Current: " + products.get(i).stock);
                    }
                    System.out.print("Select product to update: ");
                    int prodNum = sc.nextInt() - 1;
                    System.out.print("Enter new stock quantity: ");
                    int newQty = sc.nextInt();
                    products.get(prodNum).stock = newQty;
                    System.out.println("Stock updated.");
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
