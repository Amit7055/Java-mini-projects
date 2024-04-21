package product;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

	HashMap<String, Product> products;
	HashMap<String, Customer> customers;

	public Shop() {
		products = new HashMap<>();
		customers = new HashMap<>();
	}

	public void addProduct(Product product) {
		products.put(product.getProductId(), product);
	}

	public void remove(String productId) {
		products.remove(productId);
	}

	public void addCustomer(Customer customer) {
		customers.put(customer.getCustomerId(), customer);
	}

	public Product searchProductbyName(String productName) {
		for (Product product : products.values()) {
			if (product.getProductName().equalsIgnoreCase(productName)) {
				return product;
			}
		}
		return null;
	}

	public ArrayList<Product> searchProductbyPrice(double min, double max) {
		ArrayList<Product> list = new ArrayList<>();
		for (Product product : products.values()) {
			if (product.getPrice() >= min && product.getPrice() <= max) {
				list.add(product);
			}
		}
		return list;
	}

	public void removeCustomer(String customerId) {
		boolean test = customers.containsKey(customerId);
		if (test == true) {
			customers.remove(customerId);
			System.out.println("Remove Sucessfull");
		} else {
			System.out.println("Customer not found");
		}
	}

	public void addCustomerProduct(String customerId, Product product) {
		if (customers.containsKey(customerId)) {
			Customer customer = customers.get(customerId);
			customer.customerProductList(product);
			System.out.println("Product added to customer " + customerId + " successfully.");
		} else {
			System.out.println("Customer not found.");
		}
	}
	
	public void customerProduct(String customerId) {
		if (customers.containsKey(customerId)) {
			Customer customer = customers.get(customerId);
			System.out.println("Product Selected by Customer  " + customerId + " is");
			customer.customerProductDisplay();
		} else {
			System.out.println("Customer not found.");
		}
	}
	
	public void allProductDisplay() {
		for (Product product : products.values()) {
			System.out.println("Product ID: " + product.getProductId());
			System.out.println("Product Name: " + product.getProductName());
			System.out.println("Price: " + product.getPrice());
			System.out.println("Quantity: " + product.getQuanlityAvailable());
			System.out.println();
		}
	}
	
	public void allCustomerDisplay() {
		for (Customer customer : customers.values()) {
			System.out.println("Customer ID  : "+customer.getCustomerId());
			System.out.println("Customer Name  : "+customer.getCustomerName()+customer.getContactNumber());
			System.out.println("Contact  Number  : "+customer.getContactNumber());
			System.out.println("Product Purchased by "+customer.getCustomerName()+" is ");
			customerProduct(customer.getCustomerId());
		}
	}
	
	public void removeCustomerProduct(String customerId,String productId) {
		if (customers.containsKey(customerId)) {
			Customer customer = customers.get(customerId);
			customer.removeProduct(productId);
		} else {
			System.out.println("Customer not found");
		}
	}
}
