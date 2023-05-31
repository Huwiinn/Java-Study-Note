package chap04;

public class Ex18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * break 예제
		 * 
		 */
		int total = 0;
		int i = 1;
		
		/*
		while(true) {
			total += i;
			
			if(total > 1000) {
				break;
			} // break를 만나면 code block 상관없이 아래 코드가 실행되지 않는다. 
			
			i++;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", i, total);
		*/
		
		for(;; i++) {
			total += i;
			
			if(total > 1000) {
				break;
			} // break를 만나면 code block 상관없이 아래 코드가 실행되지 않는다. 
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", i, total);
	}
}