package Ch01;

import java.util.ArrayList;
import java.util.List;

public class ExLanguage {

	public static void main(String[] args) {
		
		ArrayList<Language> arrayList1 = new ArrayList<Language>();
		
		
		
		
		List<String> listStrings1 = new ArrayList<String>();
		
//		listString1.set(0, null);
//		listString1.set(1, 1); 
//		listString1.set(2, "Tony");
		
		listStrings1.add("Stark");
		listStrings1.add("Tony");
		
		//전통적인 for문
		for(int i=0; i<listStrings1.size(); i++) {
			System.out.println(listStrings1.get(i));
		}
		
		System.out.println("--------------------");
		
		//향상된 for문
		//for(데이터타입 임의의변수명 : 리스트변수명) {실행문;}
		//통상적으로는 리스트 변수명에 s를 붙이고 임의의 변수명에 s를 뺀 변수명으로 노출
		for(String listString1: listStrings1) {
			System.out.println(listString1);
		}
		
		
		//List: 인터페이스
		//ArrayList: 구현 클래스
		//인터페이스로 표현해야 이후 수정 및 관리 유지보수가 편하기에 아래 코드를 이용하는 것을 지향
		List<Language> languages = new ArrayList<Language>();
		
		for(Language language: languages) {
			System.out.println(language);
		}

	}

}
