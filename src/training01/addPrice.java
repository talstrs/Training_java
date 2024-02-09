package training01;

public class addPrice {

	public static void main(String[] args) {
		String item1 = "돈까스";
		int price1 = 8000;
		int order1 = 16;
		
		String item2 = "칼국수";
		int price2 = 6000;
		int order2 = 8;
		
		String item3 = "왕만두";
		int price3 = 5000;
		int order3 = 1;
		
		System.out.printf("%-6s x %4d = %10d\n", item1, order1, (order1*price1) );
		System.out.printf("%-6s x %4d = %10d\n", item2, order2, (order2*price2) );
		System.out.printf("%-6s x %4d = %10d\n", item3, order3, (order3*price3) );
		System.out.printf("================= \n");
		System.out.printf("총합: %6d", (price1*order1 + price2*order2 + price3*order3));
		
		// 예제 정답
		int donPrice = 8000;
        int kalPrice = 10000;
        int kingPrice = 5000;
        int donNumber = 16;
        int kalNumber = 8;
        int kingNumber = 1;
        // 결과 출력    
        System.out.printf("%s x %2d = %6d\n", "돈가스", donNumber, donPrice * donNumber);
        System.out.printf("%s x %2d = %6d\n", "칼국수", kalNumber, kalPrice * kalNumber);
        System.out.printf("%s x %2d = %6d\n", "왕만두", kingNumber, kingPrice * kingNumber);
        System.out.println("===================");
        int sum = donPrice * donNumber + kalPrice * kalNumber + kingPrice * kingNumber;
        System.out.printf("%s: %d\n", "총합", sum);
	}

}
