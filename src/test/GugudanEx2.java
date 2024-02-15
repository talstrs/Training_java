package test;

public class GugudanEx2 {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				if(j%2==1) {
					System.out.println(i + "*" + j + "=" + i*j);
				}
				else {
					continue;
				}
			}
			System.out.println("------------------");
		}
	}

}
