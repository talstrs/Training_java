package second;

public class HandbackEx {

	public static void main(String[] args) {
		
		Handback handback = new Handback();
		
		handback.brand = "브랜드 A";
		handback.price = 300000;
		handback.handbackType = 1;
		
		System.out.println("handback.brand = " + handback.brand);
		System.out.println("handback.prise = " + handback.price);
		System.out.println("handback.handbackType = " + handback.handbackType);
		
		System.out.println("---------------------------------");
		
		handback.brand = "브랜드 B";
		handback.price = 1700000;
		handback.handbackType = 2;
		
		System.out.println("handback.brand = " + handback.brand);
		System.out.println("handback.prise = " + handback.price);
		System.out.println("handback.handbackType = " + handback.handbackType);

	}

}
