package test;

import java.util.Scanner;

public class gradesEx {

	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		
		int grades = text.nextInt();
		
		
		if(grades > 100 ) {
			System.out.println("100점 이하의 정수만 입력하세요");
		} else if (grades < 0) {
				System.out.println("0 이상의 정수만 입력하세요");
		} else if (grades >= 90) {
			System.out.println(grades + "점은 A입니다");
		} else if (grades >= 80) {
			System.out.println(grades + "점은 B입니다");
		} else if (grades >= 70) {
			System.out.println(grades + "점은 C입니다");
		} else if (grades >= 60) {
			System.out.println(grades + "점은 D입니다");
		} else {
			System.out.println(grades + "점은 F입니다");
		}
		
		
	}

}
