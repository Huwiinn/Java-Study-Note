package chap04;

import java.util.Scanner;

/*
 * 아래의 가위바위보 코드를 이용하여 이길 때까지 가위바위보 게임을 구현하는 코드를 작성하라.
 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 * 이기지 않으면, 다시 처음으로 돌아와야 한다.
 * 이기면 코드를 종료한다.
 * 지거나 비기면 다시 처음으로 돌아간다.
 * 
 * 얼마나 반복해야할지 모른다 =? while 반복문 사용
 * 반복문 안에 미지수는 어떤걸 변경할지 정해줘야 무한루프가 없어질까?
 * */

public class 가위바위보_이길때까지 {

	public static void main(String[] args) {
		boolean isWin = false;
		
		while (!isWin) {
			
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");

		Scanner sc = new Scanner(System.in);
		int userValue = sc.nextInt();
		int computerValue = (int) (Math.random() * 3 + 1); // 1~3
		System.out.printf(">>> %d\n\n", userValue);
		System.out.printf(">>> %d\n\n", computerValue);

		int 가위 = 1;
		int 바위 = 2;
		int 보 = 3;
	
		
			if (userValue == 1) {
				if (computerValue == 2) {
					System.out.print("\n\n 사용자 가위, 컴퓨터 바위. 졌습니다.");

					continue;
				} else if (computerValue == 1) {
					System.out.print("\n\n 사용자 가위, 컴퓨터 가위. 비겼습니다.");

					continue;
				} else {
					System.out.print("\n\n 사용자 가위, 컴퓨터 보. 이겼습니다.");
					isWin = false;
					break;
				}
			}

			if (userValue == 2) {
				if (computerValue == 2) {
					System.out.print("\n\n 사용자 바위, 컴퓨터 바위. 비겼습니다.");
					continue;
				} else if (computerValue == 1) {
					System.out.print("\n\n 사용자 바위, 컴퓨터 가위. 이겼습니다.");
					isWin = false;
					break;
				} else {
					System.out.print("\n\n 사용자 바위, 컴퓨터 보. 졌습니다.");
					continue;
				}
			}

			if (userValue == 3) {
				if (computerValue == 2) {
					System.out.print(" \n\n 사용자 보, 컴퓨터 바위. 이겼습니다.");
					isWin = false;
					break;
				} else if (computerValue == 1) {
					System.out.print("\n\n 사용자 보, 컴퓨터 가위. 졌습니다.");
					continue;
				} else {
					System.out.print("\n\n 사용자 보, 컴퓨터 보. 비겼습니다.");
					continue;
				}
			} else {
				System.out.println("\n 1부터 3 사이의 숫자를 입력해주세요.");
			}
			sc.close();
		}
		System.out.println("게임 끝..");
	}
}