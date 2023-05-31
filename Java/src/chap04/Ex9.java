package chap04;
import java.util.Scanner;

public class Ex9 {
//	사용자에게 구구단의 단을 입력받아 구구단 결과를 출력하는 코드를 작성하라
	
//	실행 예 ) 구구단의 단을 입력하세요 : 4
/*
 * [4단]
 * 4 * 1 = 4
 * 4 * 2 = 8
 * 4 * 3 = 12
 * .. 4 * 9 = 36
 * */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단의 단을 입력하세요. >> : ");
		
		int dan = sc.nextInt();
		int total;
		
		sc.close();
		
			for(int i = 1; i <= 9; i++ ) {
				total = dan * i;
				System.out.printf("\n %d * %d = %2d ", dan, i, total);
			}	
	}
}
