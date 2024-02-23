package training01;

public class Test01 {
	

	public static void main(String[] args) {
		
		int age = 15;
		
		String answer = "";
        
        int[] digits = new int[4];
        digits[0] = age / 1000;
        digits[1] = (age % 1000) / 100;
        digits[2] = (age % 100) / 10;
        digits[3] = age % 10;
        
        
        
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        
        
        int num =0;
        
        for(int i=0; i<10; i++){
            if(digits[num]>0){
                for(int j=num; j<4; j++){
                    if(digits[j]==i){
                        answer = answer + alphabet[i];
                    }
                }
            }
            num++;
        }
        
        
		
		System.out.println(answer);

	}

}
