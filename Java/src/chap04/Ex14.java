


package chap04;

public class Ex14 {

	public static void main(String[] args) {
		int total = 0, i = 0;
		
		
		do {
			total += i;
			i++;
		} while(i <= 100);
		
		System.out.println("1부터 100까지의 합 : " + total);
	}

}
