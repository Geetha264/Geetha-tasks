package commerceproductmanagment;

import java.util.List;

public class Order {
	private Customer customer;
	 private List<Product> products;
	 private double totalAmount;
	 public Order(Customer customer, List<Product> products) {
	 this.customer = customer;
	 this.products = products;
	 this.totalAmount = calculateTotal();
	 }
	 private double calculateTotal() {
	 return products.stream().mapToDouble(Product::getPrice).sum();
	 }
	 public void placeOrder(Payment payment, Discountable discountable) {
	 customer.displayCustomer();
	 products.forEach(Product::displayDetails);
	 double discounted = discountable.applyDiscount(totalAmount);
	 System.out.println("Total after discounted");
	 payment.amount = discounted;
	 payment.processPayment();
	 }

}
