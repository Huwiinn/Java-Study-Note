package chap04;

public class Ex11 {

	public static void main(String[] args) {
//		중첩 반복 코드를 짤 때, 안과 밖의 반복문은 어떤 목적을 가지고 있는지 명확하게 구분하고 사용할 것!
		for(int i = 0; i < 4; i++) {
			System.out.println("i : " + i);
			
			for(int j = 0; j < 3; j++) {
				System.out.println("\t j : " + j);	
			}
		}

	}

}
