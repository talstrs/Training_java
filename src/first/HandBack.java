package first;

public class HandBack extends Back {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	void print() {
		System.out.println("brand: " + getBrand() +  "| model: " + getModel() + "| price: " + price);
	}

	
	

}
