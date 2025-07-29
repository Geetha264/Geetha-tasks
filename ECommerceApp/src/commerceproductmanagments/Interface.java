package commerceproductmanagments;

//Interface for discount
interface Discountable {
 double applyDiscount(double price);
}

//Interface for payment methods
interface Payment {
 void pay(double amount);
 String getMethod();
}

//UPI Payment class
class UpiPayment implements Payment {
 String upiId;

 public UpiPayment(String upiId) {
     this.upiId = upiId;
 }

 public void pay(double amount) {
     System.out.println("Paid ₹" + amount + " via UPI ID: " + upiId);
 }

 public String getMethod() {
     return "UPI";
 }
}


