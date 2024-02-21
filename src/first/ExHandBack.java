package first;

public class ExHandBack {

	public static void main(String[] args) {
		
		Back back = new Back();
		
		back.setBrand("브랜드A");
		back.setModel("모델A");
		
		System.out.println("back.getBrand: " + back.getBrand());
		System.out.println("back.getModel: " + back.getModel());
		
		System.out.println("----------------");
		
		HandBack handback = new HandBack();
		
		handback.setPrice(3000000.00);
		
		System.out.println("handback.getPrice(): " + handback.getPrice());
		
		handback.setBrand("핸드백 브랜드B");
		handback.setModel("핸드백 모델B");
		
		System.out.println("----------------------------");
		
		System.out.println("handback.getBrand(): " + handback.getBrand());
		System.out.println("handback.getModel(): " + handback.getModel());
		System.out.println("handback.getPrice(): " + handback.getPrice());
		
		
		System.out.println("------------------------");
		
		handback.print();

	}

}
