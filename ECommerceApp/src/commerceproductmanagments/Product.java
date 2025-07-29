package commerceproductmanagments;

class Product {
	   String id, name, category;
	    double price;
	    int stock;

	    public Product(String id, String name, String category, double price, int stock) {
	        this.id = id;
	        this.name = name;
	        this.category = category;
	        this.price = price;
	        this.stock = stock;
	    }

	    public void display() {
	        System.out.println(id + " | " + name + " | " + category + " | ₹" + price + " | Stock: " + stock);
	    }
}
