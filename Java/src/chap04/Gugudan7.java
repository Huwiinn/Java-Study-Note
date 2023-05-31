package chap04;

import java.util.Scanner;

public class Gugudan7 {

	/*
	 * 2단 부터 9단 까지의 전체 구구단 결과를 그림과 같이 출력되게하는 코드를 작성하세요. (수평 출력)
	 * 
	 * [코드 조건] 중첩 for 반복문 사용할 것. [단] 추가
	 */

//	가로출력 레이블 추가

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.print("[" + i + "단]\t"); // \t 칸 간격 벌림
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
	}

}
