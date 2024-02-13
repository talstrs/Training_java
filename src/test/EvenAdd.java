package test;

import java.util.Scanner;

public class EvenAdd {

	public static void main(String[] args) {
		// 변수 선언
		Scanner b = new Scanner(System.in);
		int test = b.nextInt();
		
		
		// 로직(판단)
		if((test % 2)== 0) {
			// 출력
			System.out.println(test + "는 짝수입니다");
		} else if ((test % 2) == 1) {
			// 출력
			System.out.println(test + "는 홀수입니다");
		} else {
			System.out.println("0 이상의 정수를 입력하세요");
		}
	}

}
