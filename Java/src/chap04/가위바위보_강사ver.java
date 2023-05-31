package chap04;

import java.util.Scanner;

public class 가위바위보_강사ver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user, com;
		String userStr = "", comStr = "", result = "";
		String intro = "\n\t [가위바위보 게임] \n " + "\n" + "\t 1. 가위 \n" + "\t 2. 바위 \n" + "\t 3. 보 \n";

		com = (int) (Math.random() * 3);

		System.out.print(intro);
		user = sc.nextInt() - 1;
		sc.close();

		switch (user) {
		case 0:
			userStr = "가위 ";
			break;
		case 1:
			userStr = "바위";
			break;
		case 2:
			userStr = "보";
			break;
		}

		switch (com) {
		case 0:
			comStr = "가위 ";
			break;
		case 1:
			comStr = "바위";
			break;
		case 2:
			comStr = "보";
			break;
		}

		switch (user - com) {
		case 0:
			result = "비겼습니다. ";
			break;
		case 1: case -2 :
			result = "이겼습니다.";
			break;
		case -1: case 2 :
			result = "졌습니다...";
			break;
		}
		System.out.printf("\n\t 사용자 : %s, 컴퓨터 : %s \n", userStr, comStr);
		System.out.printf("\t 가위바위보 결과 : %s, \n", result);
	}
}