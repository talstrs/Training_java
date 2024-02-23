package first;

public class Radio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("radio turnOn");
		
	}

	@Override
	public void turnOff() {
		System.out.println("radio turnOff");
		
	}
	

}
