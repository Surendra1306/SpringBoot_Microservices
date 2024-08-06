package in.surendra.Bindings;

public class Order {
	
	private String name;
	private Double price;
	private Integer orderId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "Order [name=" + name + ", price=" + price + ", orderId=" + orderId + "]";
	}
	
}
