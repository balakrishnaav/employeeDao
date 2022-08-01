package june27;

public class Product {
	private int productId;
	private String name;
	private double cost;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", cost=" + cost + "]";
	}
	public Product(int productId, String name, double cost) {
		super();
		this.productId = productId;
		this.name = name;
		this.cost = cost;
	}
	

}
