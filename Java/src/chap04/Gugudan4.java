package chap04;

public class Gugudan4 {
//	2단부터 9단까지의 전체 구구단 결과를 출력하는 코드를 작성하라. 중첩 for 반복문을 사용하기.

	/*
	 * 4 * 1 = 4 4 * 2 = 8 4 * 3 = 12 .. 9 * 9 = 81
	 */
	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan++) {
//			System.out.printf("\n [%d단] ", dan);
			for(int num = 1; num <= 9; num++) {
				System.out.printf("\n%d * %d = %d", dan, num, dan*num);
			}
		}
	}
}
