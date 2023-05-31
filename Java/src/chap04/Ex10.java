package chap04;

import java.util.Scanner;

public class Ex10 {

	/*
	 * 2단 부터 9단 까지의 전체 구구단 결과를 실행 예와 같이 출력하는 코드를 작성하세요. 2 * 1 = 2 2 * 2 = 4 2 * 3 =
	 * 6 .. 9 * 9 = 81
	 * 
	 * [코드 조건] for 반복문은 하나만 사용할 것.
	 */

	public static void main(String[] args) {
		int dan = 2, num = 1;

		for (int i = 0; i < 72; i++) {

			System.out.printf("\n %d * %d = %2d", dan, num, dan * num);
			num++;

			if (num == 10) {
				dan++;
				num = 1;
			}

		}
	}
}
