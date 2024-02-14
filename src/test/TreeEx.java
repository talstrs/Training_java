package test;

public class TreeEx {

	public static void main(String[] args) {
		
		int line = 7;
		String tree = "*";
		
		for(int i=0; i < line; i++) {
			for(int j = (line-1) - i; j >0; j--) {
				System.out.print(" ");
			}
			System.out.println(tree);
			tree += "**";
		}

	}

}
