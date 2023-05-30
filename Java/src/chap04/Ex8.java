package chap04;

public class Ex8 {
	public static void main(String[] args) {
		// 1부터 100 사이의 값 중에서 홀수의 합과 짝수의 합을 동시에 구하여 그 결과를 출력하는 코드를 작성
		
		int total = 0, oddTotal = 0;
		
		for(int even = 2, odd = 1; even <= 100 && odd <= 100; even +=2, odd += 2) {
			total += even;
			oddTotal += odd;
		}
		
		System.out.printf("\ntotal : %d", total);
		System.out.printf("\noddTotal : %d", oddTotal);
	}
}
