package chap04;

import java.util.Scanner;

public class Ex13 {

	/*
	 * 아래 중첩 for 반복문을 중첩 while 반복문으로 변환하는 코드를 작성하세요.
	 */
	public static void main(String[] args) {

//		for (int i = 2; i <= 9; i++) {
//			System.out.print("[" + i + "단]\t"); // \t 칸 간격 벌림
//		}
//		System.out.println();
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 2; j <= 9; j++) {
//				System.out.print(j + "*" + i + "=" + j * i + "\t");
//			}
//			System.out.println();
//		}
//	}
		

		int num = 0;
		while (num <= 9) {
			int dan = 2;
			while (dan <= 9) {
				if (num == 0) {
					System.out.print("[" + dan + "단]\t"); // \t 칸 간격 벌림
				} else {
					System.out.print(dan + "*" + num + "=" + dan * num + "\t");
				}
				dan++;
			}
			System.out.println();
			num++;
		}
	}
}
