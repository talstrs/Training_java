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
// System.out.print의 차이점!
// print : 괄호 안 내용을 단순히 출력. 개행문자(줄바꿈문자[\n]) 미포함
// printf : %d, %s 등을 쓰기 위해 사용하며 개행문자(줄바꿈문자[\n]) 미포함
// println : 괄호 안 내용을 출력한 후 마지막에 개행 문자가 포함되어 있어 출력 후 한 줄 띄워짐 