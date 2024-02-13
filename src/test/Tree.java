package test;

public class Tree {

	public static void main(String[] args) {
		int line = 5;  
  		System.out.println("방법1\n");
  		String tree = "*";
  		for (int i = 0; i < line; i++) {
  			for (int j = (line - 1) - i; j > 0; j--) {
  				System.out.print(" ");
  			}
  			System.out.println(tree);
  			tree += "**";
  		}
	}

}
