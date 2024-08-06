package in.surendra.bindings;

public class Order {
	
	private String name;
	private Double price;
	private Integer orderID;
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
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	@Override
	public String toString() {
		return "Order [name=" + name + ", price=" + price + ", orderID=" + orderID + "]";
	}
	
	

}
