package first;

public class Back {
	
	private String brand;
	private String model;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	// ------
	
	void print() {
		System.out.println("brand: " + brand + "model: " + model);
		
	}
	
	
	
}
