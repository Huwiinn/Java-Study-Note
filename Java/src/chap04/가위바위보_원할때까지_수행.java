package chap04;

import java.util.Scanner;

/*
 * 사용자가 원할 때 까지 계속 가위바위보를 하고, 특정 문자열을 입력하면 게임이 종료되개 하라.
 * 
 * 가위바위보를 이기고, 지고 상관없이 계속 수행해야한다.
 * 게임 결과와 함께 특정 문자열이 콘솔창애 나오며 끝내길 원하는자 물어봐야한다.
 * 
 * */

public class 가위바위보_원할때까지_수행 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String input;


//		System.out.print("문자열을 입력하세요 : ");

//		input = sc.nextLine();
//		input = sc.next();는 공백을 입력하면 다음으로 안 넘어가고 값이 입력되길 계속 기다린다.

//		for (int i = 0; i < input.length(); i++) {
//			System.out.println(input.charAt(i));
//		}

		int user, com;
		String userStr = "", comStr = "", result = "";
		String intro = "\n\t [가위바위보 게임] \n " + "\n" + "\t 1. 가위 \n" + "\t 2. 바위 \n" + "\t 3. 보 \n";

		com = (int) (Math.random() * 3);

		System.out.print(intro);
		user = sc.nextInt() - 1;
		

		while (true) {

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
			case 1:
			case -2:
				result = "이겼습니다.";

				break;
			case -1:
			case 2:
				result = "졌습니다...";
				break;
			}
			System.out.printf("\n\t 사용자 : %s, 컴퓨터 : %s \n", userStr, comStr);
			System.out.printf("\t 가위바위보 결과 : %s, \n", result);
			
			sc.nextLine();
			System.out.printf("\n\t 종료하시려면 'q'를 입력하세요 ! >>> ");
			input = sc.nextLine();
			
			if(input.length() == 1 && input.charAt(0) == 'q' || input.charAt(0) == 'Q') {
				break;
			}
		}
		sc.close();
		System.out.print("\n\t 이용해주셔서 감사합니다.");
	}
}
