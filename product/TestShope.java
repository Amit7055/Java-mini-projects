package product;

public class TestShope {

	public static void main(String[] args) {
		// Creating products
		Product product1 = new Product("P001", "Product 1", 10.0, 5);
		Product product2 = new Product("P002", "Product 2", 15.0, 3);

		// Creating customers
		Customer customer1 = new Customer("C001", "John Doe", "1234567890");
		Customer customer2 = new Customer("C002", "Jane Smith", "9876543210");

		// Creating a shop
		Shop shop = new Shop();
		
		// Adding purchased products to shop
		shop.addProduct(product1);
		shop.addProduct(product2);

		// Displaying all product
		shop.allProductDisplay();

		// Adding purchased products to customers
		customer1.customerProductList(product1);
		customer1.customerProductList(product2);

		customer2.customerProductList(product2);
		
		

		// Adding customers to the shop
		shop.addCustomer(customer1);
		shop.addCustomer(customer2);
		
		shop.customerProduct("C001");

		// Displaying all customers
		shop.allCustomerDisplay();

		// Removing a customer and their purchased products
		shop.removeCustomer("C001");

		// Displaying all customers
		shop.allCustomerDisplay();

	}

}
