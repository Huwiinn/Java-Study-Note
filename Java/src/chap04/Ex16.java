package chap04;

public class Ex16 {

	public static void main(String[] args) {
		/*
		 * 1부터 100까지의 합은 5050입니다. 그렇다면 1부터 몇 까지의 합이 최초로 1000을 초과하는 값일까요? 해당 결과를 계산하여
		 * 출력하는 코드를 작성하세요.
		 * 
		 */
		int i = 0, total = 0;

		while (total <= 1000) {
			i++;
			total += i;
		}
		System.out.printf("1부터 %d까지의합은 %d입니다.", i, total);
		// 전위연산 순서에 따라서 값이 틀릴 수 있기 때문에 순서(위치)에  유의해야한다.
		
		
//		for반복문 동작 : i값을 나중에 증가시키고 조건문을 검사하고 코드를 수행한다. 이를 명심하고 유의해야함.
//		for(i = 0; i <= 45; i++) {
//			total += i;
//		}
//		System.out.printf("1부터 %d까지의합은 %d입니다.", i, total);
//		System.out.printf("total : %d", total);

	}

}