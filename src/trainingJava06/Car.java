package trainingJava06;

public class Car {
	String brand;
	String name;
	int carType;
	double power;
	
	// 위의 변수와 아래 생성자에 있는 변수는 아예 다르다
	public Car(String brand, String name, int carType, double power) {
		this.brand = brand;
		this.name = name;
		this.carType = carType;
		this.power = power;
		
	}
	
	// 기본 생성자가 아닌 다른 생성자를 만들 경우 기본 생성자는 기본적으로 생성 필요
	
	public Car() {
		
	}
	
	public void go() {
		System.out.println("앞으로 갑니다");
	}
	
	public void back() {
		System.out.println("뒤로 갑니다");
	}
	
	public void right() {
		System.out.println("우로 갑니다");
	}
	
	public void left() {
		System.out.println("좌로 갑니다");
		
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPower() {
		return power;
	}
	
	public void setPower(double power) {
		this.power = power;
	}
}
