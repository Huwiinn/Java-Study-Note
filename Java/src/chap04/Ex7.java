package chap04;

public class Ex7 {

	public static void main(String[] args) {
		// 1부터 100 사이의 모든 홀수의 합을 구하여 그 결과를 출력하는 코드 작성
		int total = 0;
		
//	증감 연산자를 꼭 사용하지 않고 다른 식을 넣어도 가능하다.
		
//		for(int i =1; i <=100; i++) {
//			if(i % 2 != 0) {
//				total += i;
//			}
//		}
//		System.out.printf("1부터 100 사이의 홀수 total : %d ", total);
		
		
//		두번째 방법
		for(int i =1; i <=100; i+=2) {
			total += i;
		}
		System.out.printf("1부터 100 사이의 홀수 total : %d ", total);
	}
	}
