package training01;

public class listFrinting {

	public static void main(String[] args) {
		String item1 = "한우 꽃등심";
		int price1 = 112500;
		
		String item2 = "참치 선물";
		int price2 = 25500;
		
		String item3 = "맥스봉 한팩";
		int price3 = 500;
		
		System.out.println("품명: " + item1 + "가격: " + price1);
		System.out.println("품명: " + item2 + "가격: " + price2);
		System.out.println("품명: " + item3 + "가격: " + price3);
		
		// 문법: %[argument_index$][flags][width]conversion 
		// conversion: 표현할 데이터 타입
		// s: 문자열, d: 정수, x: 16진수, o: 8진수, f: 실수
		// flags: '-'로 사용시 왼쪽 정렬, 미사용시 오른쪽 정렬
		// width: 길이 지정 옵션
		// \n: 줄 바꿈 기능
		// %d: 10진수(정수), %x: 16진수, %o: 8진수, %f: 실수
		System.out.printf("품명: %-10s 가격: %8d\n", item1, price1);
        System.out.printf("품명: %-10s 가격: %8d\n", item2, price2);
        System.out.printf("품명: %-10s 가격: %8d\n", item3, price3);
		
	}

}
