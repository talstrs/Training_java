package training01;

import java.util.Scanner;

public class PayAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner money = new Scanner(System.in);
		
		int uro = money.nextInt();
		int dall = money.nextInt();
		
		double urodata = uro * 1320.48026;
		double dalldata = dall * 1063.82979;
		
		int total = (int)(urodata + dalldata);
		System.out.printf("%-4d 유로 + %-4d 달러 = %10d 원 \n", uro, dall, total);
		

	}

}
