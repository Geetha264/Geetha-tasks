package commerceproductmanagments;

class CashOnDelivery implements Payment {
    public void pay(double amount) {
        System.out.println("Amount ₹" + amount + " to be paid on delivery.");
    }

    public String getMethod() {
        return "CashOnDelivery";
    }
}