package test;

public class GugudanEx3 {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			int z = 0;
			for(int j=1; j<10; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
				z += i*j;
			}
			System.out.println("------------------");
			System.out.println(i + "단합: " + z);
			System.out.println("------------------");
		}


	}

}
