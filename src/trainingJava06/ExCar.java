package trainingJava06;

import second.Handback;

public class ExCar {

	public static void main(String[] args) {
		
		Car car = new Car();
		Car car4 = new Car("BMW", "5841", 2, 361.21);
		
		car.brand = "benz";
		car.name = "s class";
		car.carType = 1;
		car.power = 350.24;
		
		System.out.println("car.brand =" + car.brand);
		System.out.println("car.name =" + car.name);
		System.out.println("car.carType =" + car.carType);
		System.out.println("car.power =" + car.power);
		
		System.out.println("---------------------------");
		
		car.brand = "현대";
		car.name = "현대 차";
		car.carType = 2;
		car.power = 150.78;
		
		System.out.println("car.brand =" + car.brand);
		System.out.println("car.name =" + car.name);
		System.out.println("car.carType =" + car.carType);
		System.out.println("car.power =" + car.power);
		
		System.out.println("---------------------------");
		
		car.brand = "기아";
		car.name = "기아 차";
		car.carType = 3;
		car.power = 212.94;
		
		System.out.println("car.brand =" + car.brand);
		System.out.println("car.name =" + car.name);
		System.out.println("car.carType =" + car.carType);
		System.out.println("car.power =" + car.power);
		
		System.out.println("---------------------------");
		
		SportsCar sportscar = new SportsCar();
		
		sportscar.brand = "스포츠카 브랜드";
		sportscar.name = "스포츠카 이름";
		sportscar.carType = 4;
		sportscar.power = 473.31;
		
		System.out.println("sportscar.brand =" + sportscar.brand);
		System.out.println("sportscar.name =" + sportscar.name);
		System.out.println("sportscar.carType =" + sportscar.carType);
		System.out.println("sportscar.power =" + sportscar.power);
		
		System.out.println("---------------------------");
		
		Handback handback = new Handback();
		
		handback.price = 1542;
		
		car.go();
		car.back();
		car.right();
		car.left();
		
		System.out.println("---------------------------");
		
		System.out.println("car4.brand =" + car4.brand);
		System.out.println("car4.name =" + car4.name);
		System.out.println("car4.carType =" + car4.carType);
		System.out.println("car4.power =" + car4.power);
		
		
	}

}
