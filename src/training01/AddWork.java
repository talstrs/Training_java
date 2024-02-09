package training01;

import java.util.Scanner;

public class AddWork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int basePay = input.nextInt();
		int workTime = input.nextInt();
		
		int pay = basePay * workTime;
		
		System.out.println(pay);
	}

}
