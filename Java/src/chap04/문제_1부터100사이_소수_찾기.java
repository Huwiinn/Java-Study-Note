package chap04;

public class 문제_1부터100사이_소수_찾기 {
	/*
	 * 1부터 100 사이의 모든 소수를 아래와 같이 출력하는 코드를 작성하라.
	 * 
	 * [실행 예]
	 * 2 3 5 7 11
	 * 13 17 19 23 29
	 * 31 37 41 43 47
	 * 53 59 61 67 71
	 * 73 79 83 89 97
	 * 
	 * -----------------------------
	 * 나누었을 때, 1과 나 자신만 있어야 함.
	 * 
	 * */

	public static void main(String[] args) {
		int num = 1;
		
		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
//				continue;
					System.out.println("i : " + i);
					System.out.println("j " + j);
				}
			}
			
//			if(num == 1) {
//				System.out.println(i);	
//			}
//			num = 0;
			
		}

	}

}
