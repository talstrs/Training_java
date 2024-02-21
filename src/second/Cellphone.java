package second;

public class Cellphone extends Phone {
	
	// 필드
		private String telecom;

		
		
		//get, set 메소드
		public String getTelecom() {
			return telecom;
		}

		public void setTelecom(String telecom) {
			this.telecom = telecom;
		}
		
//		//메소드
//		void powerOnCellphone() {
//			System.out.println("cellphone의 전원을 켭니다.");
//		}
//		
//		void powerOffCellphone() {
//			System.out.println("cellphone의 전원을 끕니다.");
//		}
		
		// 오버라이드
		
		@Override
		void powerOn() {
			System.out.println("cellphone의 전원을 켭니다. 오버라이드");
		}

		@Override
		void powerOff() {
			System.out.println("cellphone의 전원을 끕니다. 오버라이드");
		}
		
}
