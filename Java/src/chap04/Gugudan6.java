package chap04;

public class Gugudan6 {

	/*
	 * 2단 부터 9단 까지의 전체 구구단 결과를 그림과 같이 출력되게하는 코드를 작성하세요. (수평 출력)
	 * 
	 * [코드 조건] 중첩 for 반복문 사용할 것.
	 */

// 구구단	가로출력
	public static void main(String[] args) {
	    for(int i = 2; i <= 9; i++) {
	        for(int j = 1; j <= 9; j++) {
	            System.out.printf("%d * %d = %2d \t", j, i, i * j);
	        }
	        System.out.println(); // 줄 바꿈 추가. 아래 출력문이랑 같은 역할임.
//	        System.out.printf("\n");
	    }
	}
	
/*
 * 처음에 가로 출력이 이해가 되지 않았다.
 * 두어시간 보니까 세로로 출력되다가 가로로 출력되는 것이 아닌, 가로로 1 * 2 , 2 * 2, 3 * 3 ...
 * 이렇게 진행되다가 9까지 가면 다시 i가 증가하고 j만큼(1~9까지)도는 방식으로 가로 출력이 가능한 것이었다.
 * */

}