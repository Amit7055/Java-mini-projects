package product;

import java.util.ArrayList;

public class Customer {
	private String customerId;
	private String customerName;
	private String contactNumber;
	ArrayList<Product> purchasedProducts;

	public Customer(String customerId, String customerName, String contactNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.purchasedProducts = new ArrayList<>();
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public ArrayList<Product> getPurchasedProducts() {
		return purchasedProducts;
	}

	public void setPurchasedProducts(ArrayList<Product> purchasedProducts) {
		this.purchasedProducts = purchasedProducts;
	}

	public void removeProduct(String productId) {
		boolean test = false;
		for (Product product : purchasedProducts) {
			if (product.getProductId().equals(productId)) {
				purchasedProducts.remove(product);
				System.out.println("Remove Sucessfull");
				test=true;
				break;
			}
		}
		if(test==false) {
			System.out.println("Product not found");
		}

	}

	public void customerProductList(Product product) {
		purchasedProducts.add(product);
	}

	public void customerProductDisplay() {
		if (purchasedProducts.isEmpty()) {
			System.out.println("No purchased products.");
		} else {
			System.out.println("Purchased products for customer " + customerId + ":");
			for (Product product : purchasedProducts) {
				System.out.println("Product ID: " + product.getProductId());
				System.out.println("Product Name: " + product.getProductName());
				System.out.println("Price: " + product.getPrice());
				System.out.println();
			}
		}
	}
}
