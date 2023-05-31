package chap04;

public class Ex20 {

	public static void main(String[] args) {
		/*
		 * 1부터 100까지의 합은 5050입니다. 그렇다면 1부터 몇 까지의 합이 최초로 1000을 초과하는 값일까요? 해당 결과를 계산하여
		 * 출력하는 코드를 작성하세요.
		 * 
		 */
		int i = 0, total = 0;

		while (total <= 1000) {
			total += i;
			
			if(total > 1000) {
				continue;
			}
			i++;
		}
		System.out.printf("1부터 %d까지의합은 %d입니다.", i, total);
	}
}