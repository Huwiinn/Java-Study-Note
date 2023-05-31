package chap04;

import java.util.Scanner;

public class 가위바위보_다시_해보기 {

	public static void main(String[] args) {
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");

		Scanner sc = new Scanner(System.in);
		int userValue = sc.nextInt();
		int computerValue = (int) (Math.random() * 3 + 1); // 1~3
		System.out.printf(">>> %d\n\n", userValue);

		int 가위 = 1;
		int 바위 = 2;
		int 보 = 3;
		
		if(userValue == 1) {
			if(computerValue == 2) {
				System.out.print("사용자 가위, 컴퓨터 바위. 졌습니다.");
			} else if(computerValue == 1) {
				System.out.print("사용자 가위, 컴퓨터 가위. 비겼습니다.");
			} else {
				System.out.print("사용자 가위, 컴퓨터 보. 이겼습니다.");
			}
		}
		
		if(userValue == 2) {
			if(computerValue == 2) {
				System.out.print("사용자 바위, 컴퓨터 바위. 비겼습니다.");
			} else if(computerValue == 1) {
				System.out.print("사용자 바위, 컴퓨터 가위. 이겼습니다.");
			} else {
				System.out.print("사용자 바위, 컴퓨터 보. 졌습니다.");
			}
		}
		
		if(userValue == 3) {
			if(computerValue == 2) {
				System.out.print("사용자 보, 컴퓨터 바위. 이겼습니다.");
			} else if(computerValue == 1) {
				System.out.print("사용자 보, 컴퓨터 가위. 졌습니다.");
			} else {
				System.out.print("사용자 보, 컴퓨터 보. 비겼습니다.");
			}
		}

	}
}