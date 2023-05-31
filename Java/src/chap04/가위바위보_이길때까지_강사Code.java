package chap04;

import java.util.Scanner;

/*
 * 아래의 가위바위보 코드를 이용하여 이길 때까지 가우ㅢ바위보 게임을 구현하는 코드를 작성하라.
 * */

public class 가위바위보_이길때까지_강사Code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user, com;
		String userStr = "", comStr = "", result = "";
		String intro = "\n\t [가위바위보 게임] \n " + "\n" + "\t 1. 가위 \n" + "\t 2. 바위 \n" + "\t 3. 보 \n";
		
		boolean isWin = false;
		
	do {
		com = (int) (Math.random() * 3);

		System.out.print(intro);
		user = sc.nextInt() - 1;
		

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

		switch (user - com) { // 유저와 컴퓨터의 값을 연산하고 아래 케이스의 결과값을 result에 반환함.
		case 0:
			result = "비겼습니다. ";
			break;
		case 1: case -2 :
			result = "이겼습니다.";
			isWin = true;
			break;
		case -1: case 2 :
			result = "졌습니다...";
			break;
		}
		System.out.printf("\n\t 사용자 : %s, 컴퓨터 : %s \n", userStr, comStr);
		System.out.printf("\t 가위바위보 결과 : %s, \n", result);
	} while(!isWin);
	
	sc.close();
	System.out.print("\n\t 이용해주셔서 감사합니다.");
	}
}