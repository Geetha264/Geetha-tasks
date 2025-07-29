package commerceproductmanagment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Customer input
        System.out.print("Enter Customer Name: ");
        String custName = sc.nextLine();
        System.out.print("Enter Customer Email: ");
        String custEmail = sc.nextLine();
        Customer customer = new Customer(custName, custEmail);

        // Product input
        List<Product> productList = new ArrayList<>();
        System.out.print("How many products to add? ");
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.print("Enter product type (1: Electronics, 2: Clothing): ");
            int type = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Product ID: ");
            String pid = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = Double.parseDouble(sc.nextLine());

            if (type == 1) {
                System.out.print("Enter Brand: ");
                String brand = sc.nextLine();
                System.out.print("Enter Warranty (in months): ");
                int warranty = Integer.parseInt(sc.nextLine());
                productList.add(new Electronics(pid, name, price, brand, warranty));
            } else if (type == 2) {
                System.out.print("Enter Size: ");
                String size = sc.nextLine();
                System.out.print("Enter Fabric: ");
                String fabric = sc.nextLine();
                productList.add(new Clothing(pid, name, price, size, fabric));
            } else {
                System.out.println("Invalid product type. Skipping...");
            }
        }

        // Create order
        Order order = new Order(customer, productList);

        // Discount using lambda
        Discountable discount = price -> price * 0.9;

        // Payment input
        System.out.print("Enter UPI ID for payment: ");
        String upiId = sc.nextLine();
        Payment payment = new UpiPayment(count, upiId);

        // Place the order
        order.placeOrder(payment, discount);
    }
}