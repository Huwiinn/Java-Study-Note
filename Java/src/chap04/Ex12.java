package chap04;

public class Ex12 {

	public static void main(String[] args) {
		int total = 0;
		
//		for(int i = 0; i<=100; i++) {
//			total += i;
//		}
		
		int i = 1;
		while(i <= 100) {
			total += i;
			i++;
		}
		
		System.out.println("1부터 100까지의 합 : " + total);
	}

}
