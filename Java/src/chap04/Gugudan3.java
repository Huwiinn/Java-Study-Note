package chap04;

import java.util.Scanner;

public class Gugudan3 {

	/*
	 * 2단 부터 9단 까지의 전체 구구단 결과를 실행 예와 같이 출력하는 코드를 작성하세요.
	 * 
	 * [코드 조건] for 반복문은 하나만 사용할 것.
	 * 
	 * [실행 예] [2단] 2 * 1 = 2 ... [3단] 3 * 1 = 3 [4단] 4 * 1 = 4
	 */

//	아래는 권장하지 않는 코드. 예시로 보여준 것임.
//	Why? => 하나의 반복문은 하나의 목적을 위해 사용되어야 한다. 하나의 반복문 안에 여러개가 들어있으면 관리하기 힘들어진다.
//	** 반복문은 언제나 항상 한 가지 목적만을 위해서 사용되어야한다.
//	중첩 반복문을 이용하여 코드를 더 Develop 시켜주기 위해서 이렇게 짠 것임.
	public static void main(String[] args) {
		int dan = 2, num = 1;

		for (int i = 0; i < 72; i++) {
			if (num == 1) {
				System.out.printf("\n\n[%d단]", dan);
			}

			System.out.printf("\n %d * %d = %2d", dan, num, dan * num);
			num++;

			if (num == 10) {
				dan++;
				num = 1;
			}

		}
	}
}



