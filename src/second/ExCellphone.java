package second;

public class ExCellphone {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		
		phone.setModel("클래식전화기");
		phone.setColor("갈색");
		
		System.out.println("phone.getModel(): " + phone.getModel());
		System.out.println("phone.getColor(): " + phone.getColor());
		
		phone.powerOn();
		phone.powerOff();
		
		System.out.println("-------------------");
		
		Cellphone cellphone = new Cellphone();
		
		cellphone.setTelecom("SKT");
		cellphone.setModel("SAMSUNG");
		cellphone.setColor("PINK");
		
		System.out.println("cellphone.getTelecom(): " + cellphone.getTelecom());
		System.out.println("cellphone.getModel(): " + cellphone.getModel());
		System.out.println("cellphone.getColor(): " + cellphone.getColor());
		
		cellphone.powerOn();
		cellphone.powerOff();
		
//		cellphone.powerOnCellphone();
//		cellphone.powerOffCellphone();
		
		System.out.println("-------------------");
		
		
		
	}

}
