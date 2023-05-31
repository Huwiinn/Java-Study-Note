package chap04;

public class Ex19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * continue 예제
		 * 1부터 100 사이의 짝수의 합을 구하는 코드를 작성하세요.
		 * continue를 이용하세요.
		 * 
		 */
		int total = 0;
		
// for	
		// 이후에 건너뛰고 증감식으로 간다. 그 후 조건식으로 이동
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 != 0) {
//				continue;
//			}
//			total += i;
//		}
//		System.out.println("total : " + total);

		// while
		// 이후에 증감식이 없음. 바로 조건식으로 간다.
		// continue 이후에 미지수를 연산하게 되면 무한루프에 빠진다. 때문에 컨티뉴 앞으로 증감연산자가 와야한다.
		int i = 1;
		while(i <= 100) {
//			i++; 여기 있으면 어떻게 동작하는지 실행시켜보고 학습하기
			if(i % 2 != 0) {
				i++;
				continue;
			}
			total += i;
			i++;
		}
		System.out.println("total : " + total);
	}
}