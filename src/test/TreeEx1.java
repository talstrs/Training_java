package test;

public class TreeEx1 {

	public static void main(String[] args) {
		int line = 5;
		
		for(int i=1; i<=line; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
