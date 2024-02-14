package test;

public class TreeExtwo {

	public static void main(String[] args) {
		
		int test = 7;
		String tree = "*";
		
		for(int i=0; i < test; i++) {
			for(int j= 1; j <= test-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<= (i*2)-1; j++) {
				System.out.print(tree);
			}
			System.out.println();
		}

	}

}
