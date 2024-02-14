package test;

import java.util.Arrays;

public class LottoEx {
	
	public static int startNumber() {
		return (int)(Math.random() * 45) +1;
	}

	public static void main(String[] args) {
		
		int[] pickNumbers = new int[6];
		
		for (int i =0; i< pickNumbers.length; i++ ) {
			pickNumbers[i] = startNumber();
		}
		
		
		boolean[] isPicked = new boolean[46];
		int[] numbers = new int[6];
		
		for(int i=0; i< numbers.length; i++) {
			//임시번호 생성
			while (true) {
			int tempNum = startNumber();
			//중복이 아니라면
			if (isPicked[tempNum] == false) {
				// 뽑았다고 체크
				isPicked[tempNum] = true;
				numbers[i] = tempNum;
				// 반복문 탈출
				break;
			}}
		}
		
		Arrays.sort(numbers);
		
		for (int n : numbers) {
			System.out.printf("%d \n", n);
		}
		
	}

}
