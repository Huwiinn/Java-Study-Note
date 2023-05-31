package chap04;

import java.util.Scanner;

public class Gugudan5 {

	/*
	 * 2단 부터 9단 까지의 전체 구구단 결과를 실행 예와 같이 출력하는 코드를 작성하세요.
	 * 
	 * [코드 조건] 중첩 for 반복문 사용할 것.
	 * 
	 * [실행 예] [2단] 2 * 1 = 2 ... [3단] 3 * 1 = 3 [4단] 4 * 1 = 4
	 */

//	Gugudan3 중첩 반복문으로 다시 코딩.
	public static void main(String[] args) {

		for(int dan = 2; dan <= 9; dan++) {
			System.out.printf("\n\n[%d단]", dan);
			for(int num = 1; num <= 9; num++) {
				System.out.printf("\n %d * %d = %2d", dan, num, dan * num);
			}
		}
	}
}
