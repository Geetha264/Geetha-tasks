package commerceproductmanagments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Order {
	    static int counter = 1001;
	    int orderId;
	    Customer customer;
	    Product product;
	    double finalAmount;
	    String paymentMethod;
	    boolean isCancelled;

	    public Order(Customer customer, Product product, double finalAmount, String paymentMethod) {
	        this.orderId = counter++;
	        this.customer = customer;
	        this.product = product;
	        this.finalAmount = finalAmount;
	        this.paymentMethod = paymentMethod;
	        this.isCancelled = false;
	    }

	    public void cancel() {
	        if (!isCancelled) {
	            isCancelled = true;
	            product.stock++; // add back to stock
	            System.out.println("Order #" + orderId + " cancelled successfully.");
	        } else {
	            System.out.println("Order #" + orderId + " is already cancelled.");
	        }
	    }

	    public void saveToFile() {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("orders.txt", true))) {
	            writer.write(orderId + "," + customer.name + "," + product.name + "," +
	                         finalAmount + "," + paymentMethod + "," + isCancelled);
	            writer.newLine();
	        } catch (IOException e) {
	            System.out.println("Error saving order.");
	        }
	    }

	    public static void showAllOrders() {
	        try (BufferedReader reader = new BufferedReader(new FileReader("orders.txt"))) {
	            String line;
	            System.out.println("\n--- Orders from File ---");
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(",");
	                System.out.println("OrderID: " + parts[0] + " | Customer: " + parts[1] +
	                        " | Product: " + parts[2] + " | Amount: ₹" + parts[3] +
	                        " | Payment: " + parts[4] + " | Cancelled: " + parts[5]);
	            }
	        } catch (IOException e) {
	            System.out.println("No saved orders found.");
	        }
	    }
	}


