package product;

public class Product {
	private String productId;
	private String productName;
	private double price;
	private int quanlityAvailable;

	public Product(String productId, String productName, double price, int quanlityAvailable) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quanlityAvailable = quanlityAvailable;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuanlityAvailable() {
		return quanlityAvailable;
	}

	public void setQuanlityAvailable(int quanlityAvailable) {
		this.quanlityAvailable = quanlityAvailable;
	}

}
